package com.example.processor;

import java.util.function.Function;

import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KeyValueMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.model.CuratedCustomer;
import com.example.model.Customer;

@Component
public class Curator {
	
	@Bean
	public Function<KStream<String, Customer>, KStream<String, CuratedCustomer>> curateCustomer() {

		return stream -> stream.map(curate());
	}

	public KeyValueMapper<String, Customer, KeyValue<String, CuratedCustomer>> curate() {
		return (key, value) -> {

			System.out.println("Curation of the customer with id::" + key);
			CuratedCustomer newValue = new CuratedCustomer();
			newValue.setCustomerNumber(value.getCustomerNumber());
			newValue.setCustomerName(value.getCustomerName());
			newValue.setContactFirstName(value.getContactFirstName());
			newValue.setContactLastName(value.getContactLastName());
			newValue.setState(value.getState());
			newValue.setCountry(value.getCountry());
			return new KeyValue<String, CuratedCustomer>(key, newValue);
		};
	}
}
