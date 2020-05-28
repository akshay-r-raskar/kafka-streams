/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Customer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1758488367641684002L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Customer\",\"namespace\":\"com.example.model\",\"fields\":[{\"name\":\"customerNumber\",\"type\":\"int\"},{\"name\":\"customerName\",\"type\":\"string\"},{\"name\":\"contactLastName\",\"type\":\"string\"},{\"name\":\"contactFirstName\",\"type\":\"string\"},{\"name\":\"phone\",\"type\":\"string\"},{\"name\":\"addressLine1\",\"type\":\"string\"},{\"name\":\"addressLine2\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"state\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"postalCode\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"country\",\"type\":\"string\"},{\"name\":\"salesRepEmployeeNumber\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"creditLimit\",\"type\":[\"null\",{\"type\":\"bytes\",\"connect.name\":\"org.apache.kafka.connect.data.Decimal\",\"connect.parameters\":{\"connect.decimal.precision\":\"10\",\"scale\":\"2\"},\"connect.version\":1,\"logicalType\":\"decimal\",\"precision\":10,\"scale\":2}],\"default\":null},{\"name\":\"__deleted\",\"type\":[\"null\",\"string\"],\"default\":null}],\"connect.name\":\"com.example.model.Customer\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Customer> ENCODER =
      new BinaryMessageEncoder<Customer>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Customer> DECODER =
      new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Customer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Customer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Customer to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Customer from a ByteBuffer. */
  public static Customer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int customerNumber;
  @Deprecated public java.lang.CharSequence customerName;
  @Deprecated public java.lang.CharSequence contactLastName;
  @Deprecated public java.lang.CharSequence contactFirstName;
  @Deprecated public java.lang.CharSequence phone;
  @Deprecated public java.lang.CharSequence addressLine1;
  @Deprecated public java.lang.CharSequence addressLine2;
  @Deprecated public java.lang.CharSequence city;
  @Deprecated public java.lang.CharSequence state;
  @Deprecated public java.lang.CharSequence postalCode;
  @Deprecated public java.lang.CharSequence country;
  @Deprecated public java.lang.Integer salesRepEmployeeNumber;
  @Deprecated public java.nio.ByteBuffer creditLimit;
  @Deprecated public java.lang.CharSequence __deleted;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Customer() {}

  /**
   * All-args constructor.
   * @param customerNumber The new value for customerNumber
   * @param customerName The new value for customerName
   * @param contactLastName The new value for contactLastName
   * @param contactFirstName The new value for contactFirstName
   * @param phone The new value for phone
   * @param addressLine1 The new value for addressLine1
   * @param addressLine2 The new value for addressLine2
   * @param city The new value for city
   * @param state The new value for state
   * @param postalCode The new value for postalCode
   * @param country The new value for country
   * @param salesRepEmployeeNumber The new value for salesRepEmployeeNumber
   * @param creditLimit The new value for creditLimit
   * @param __deleted The new value for __deleted
   */
  public Customer(java.lang.Integer customerNumber, java.lang.CharSequence customerName, java.lang.CharSequence contactLastName, java.lang.CharSequence contactFirstName, java.lang.CharSequence phone, java.lang.CharSequence addressLine1, java.lang.CharSequence addressLine2, java.lang.CharSequence city, java.lang.CharSequence state, java.lang.CharSequence postalCode, java.lang.CharSequence country, java.lang.Integer salesRepEmployeeNumber, java.nio.ByteBuffer creditLimit, java.lang.CharSequence __deleted) {
    this.customerNumber = customerNumber;
    this.customerName = customerName;
    this.contactLastName = contactLastName;
    this.contactFirstName = contactFirstName;
    this.phone = phone;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.city = city;
    this.state = state;
    this.postalCode = postalCode;
    this.country = country;
    this.salesRepEmployeeNumber = salesRepEmployeeNumber;
    this.creditLimit = creditLimit;
    this.__deleted = __deleted;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customerNumber;
    case 1: return customerName;
    case 2: return contactLastName;
    case 3: return contactFirstName;
    case 4: return phone;
    case 5: return addressLine1;
    case 6: return addressLine2;
    case 7: return city;
    case 8: return state;
    case 9: return postalCode;
    case 10: return country;
    case 11: return salesRepEmployeeNumber;
    case 12: return creditLimit;
    case 13: return __deleted;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: customerNumber = (java.lang.Integer)value$; break;
    case 1: customerName = (java.lang.CharSequence)value$; break;
    case 2: contactLastName = (java.lang.CharSequence)value$; break;
    case 3: contactFirstName = (java.lang.CharSequence)value$; break;
    case 4: phone = (java.lang.CharSequence)value$; break;
    case 5: addressLine1 = (java.lang.CharSequence)value$; break;
    case 6: addressLine2 = (java.lang.CharSequence)value$; break;
    case 7: city = (java.lang.CharSequence)value$; break;
    case 8: state = (java.lang.CharSequence)value$; break;
    case 9: postalCode = (java.lang.CharSequence)value$; break;
    case 10: country = (java.lang.CharSequence)value$; break;
    case 11: salesRepEmployeeNumber = (java.lang.Integer)value$; break;
    case 12: creditLimit = (java.nio.ByteBuffer)value$; break;
    case 13: __deleted = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'customerNumber' field.
   * @return The value of the 'customerNumber' field.
   */
  public java.lang.Integer getCustomerNumber() {
    return customerNumber;
  }

  /**
   * Sets the value of the 'customerNumber' field.
   * @param value the value to set.
   */
  public void setCustomerNumber(java.lang.Integer value) {
    this.customerNumber = value;
  }

  /**
   * Gets the value of the 'customerName' field.
   * @return The value of the 'customerName' field.
   */
  public java.lang.CharSequence getCustomerName() {
    return customerName;
  }

  /**
   * Sets the value of the 'customerName' field.
   * @param value the value to set.
   */
  public void setCustomerName(java.lang.CharSequence value) {
    this.customerName = value;
  }

  /**
   * Gets the value of the 'contactLastName' field.
   * @return The value of the 'contactLastName' field.
   */
  public java.lang.CharSequence getContactLastName() {
    return contactLastName;
  }

  /**
   * Sets the value of the 'contactLastName' field.
   * @param value the value to set.
   */
  public void setContactLastName(java.lang.CharSequence value) {
    this.contactLastName = value;
  }

  /**
   * Gets the value of the 'contactFirstName' field.
   * @return The value of the 'contactFirstName' field.
   */
  public java.lang.CharSequence getContactFirstName() {
    return contactFirstName;
  }

  /**
   * Sets the value of the 'contactFirstName' field.
   * @param value the value to set.
   */
  public void setContactFirstName(java.lang.CharSequence value) {
    this.contactFirstName = value;
  }

  /**
   * Gets the value of the 'phone' field.
   * @return The value of the 'phone' field.
   */
  public java.lang.CharSequence getPhone() {
    return phone;
  }

  /**
   * Sets the value of the 'phone' field.
   * @param value the value to set.
   */
  public void setPhone(java.lang.CharSequence value) {
    this.phone = value;
  }

  /**
   * Gets the value of the 'addressLine1' field.
   * @return The value of the 'addressLine1' field.
   */
  public java.lang.CharSequence getAddressLine1() {
    return addressLine1;
  }

  /**
   * Sets the value of the 'addressLine1' field.
   * @param value the value to set.
   */
  public void setAddressLine1(java.lang.CharSequence value) {
    this.addressLine1 = value;
  }

  /**
   * Gets the value of the 'addressLine2' field.
   * @return The value of the 'addressLine2' field.
   */
  public java.lang.CharSequence getAddressLine2() {
    return addressLine2;
  }

  /**
   * Sets the value of the 'addressLine2' field.
   * @param value the value to set.
   */
  public void setAddressLine2(java.lang.CharSequence value) {
    this.addressLine2 = value;
  }

  /**
   * Gets the value of the 'city' field.
   * @return The value of the 'city' field.
   */
  public java.lang.CharSequence getCity() {
    return city;
  }

  /**
   * Sets the value of the 'city' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.city = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public java.lang.CharSequence getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'postalCode' field.
   * @return The value of the 'postalCode' field.
   */
  public java.lang.CharSequence getPostalCode() {
    return postalCode;
  }

  /**
   * Sets the value of the 'postalCode' field.
   * @param value the value to set.
   */
  public void setPostalCode(java.lang.CharSequence value) {
    this.postalCode = value;
  }

  /**
   * Gets the value of the 'country' field.
   * @return The value of the 'country' field.
   */
  public java.lang.CharSequence getCountry() {
    return country;
  }

  /**
   * Sets the value of the 'country' field.
   * @param value the value to set.
   */
  public void setCountry(java.lang.CharSequence value) {
    this.country = value;
  }

  /**
   * Gets the value of the 'salesRepEmployeeNumber' field.
   * @return The value of the 'salesRepEmployeeNumber' field.
   */
  public java.lang.Integer getSalesRepEmployeeNumber() {
    return salesRepEmployeeNumber;
  }

  /**
   * Sets the value of the 'salesRepEmployeeNumber' field.
   * @param value the value to set.
   */
  public void setSalesRepEmployeeNumber(java.lang.Integer value) {
    this.salesRepEmployeeNumber = value;
  }

  /**
   * Gets the value of the 'creditLimit' field.
   * @return The value of the 'creditLimit' field.
   */
  public java.nio.ByteBuffer getCreditLimit() {
    return creditLimit;
  }

  /**
   * Sets the value of the 'creditLimit' field.
   * @param value the value to set.
   */
  public void setCreditLimit(java.nio.ByteBuffer value) {
    this.creditLimit = value;
  }

  /**
   * Gets the value of the '__deleted' field.
   * @return The value of the '__deleted' field.
   */
  public java.lang.CharSequence getDeleted$1() {
    return __deleted;
  }

  /**
   * Sets the value of the '__deleted' field.
   * @param value the value to set.
   */
  public void setDeleted$1(java.lang.CharSequence value) {
    this.__deleted = value;
  }

  /**
   * Creates a new Customer RecordBuilder.
   * @return A new Customer RecordBuilder
   */
  public static com.example.model.Customer.Builder newBuilder() {
    return new com.example.model.Customer.Builder();
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Customer RecordBuilder
   */
  public static com.example.model.Customer.Builder newBuilder(com.example.model.Customer.Builder other) {
    return new com.example.model.Customer.Builder(other);
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Customer instance.
   * @param other The existing instance to copy.
   * @return A new Customer RecordBuilder
   */
  public static com.example.model.Customer.Builder newBuilder(com.example.model.Customer other) {
    return new com.example.model.Customer.Builder(other);
  }

  /**
   * RecordBuilder for Customer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Customer>
    implements org.apache.avro.data.RecordBuilder<Customer> {

    private int customerNumber;
    private java.lang.CharSequence customerName;
    private java.lang.CharSequence contactLastName;
    private java.lang.CharSequence contactFirstName;
    private java.lang.CharSequence phone;
    private java.lang.CharSequence addressLine1;
    private java.lang.CharSequence addressLine2;
    private java.lang.CharSequence city;
    private java.lang.CharSequence state;
    private java.lang.CharSequence postalCode;
    private java.lang.CharSequence country;
    private java.lang.Integer salesRepEmployeeNumber;
    private java.nio.ByteBuffer creditLimit;
    private java.lang.CharSequence __deleted;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.model.Customer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customerNumber)) {
        this.customerNumber = data().deepCopy(fields()[0].schema(), other.customerNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customerName)) {
        this.customerName = data().deepCopy(fields()[1].schema(), other.customerName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.contactLastName)) {
        this.contactLastName = data().deepCopy(fields()[2].schema(), other.contactLastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contactFirstName)) {
        this.contactFirstName = data().deepCopy(fields()[3].schema(), other.contactFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.phone)) {
        this.phone = data().deepCopy(fields()[4].schema(), other.phone);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.addressLine1)) {
        this.addressLine1 = data().deepCopy(fields()[5].schema(), other.addressLine1);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.addressLine2)) {
        this.addressLine2 = data().deepCopy(fields()[6].schema(), other.addressLine2);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.city)) {
        this.city = data().deepCopy(fields()[7].schema(), other.city);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.state)) {
        this.state = data().deepCopy(fields()[8].schema(), other.state);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.postalCode)) {
        this.postalCode = data().deepCopy(fields()[9].schema(), other.postalCode);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.country)) {
        this.country = data().deepCopy(fields()[10].schema(), other.country);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.salesRepEmployeeNumber)) {
        this.salesRepEmployeeNumber = data().deepCopy(fields()[11].schema(), other.salesRepEmployeeNumber);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.creditLimit)) {
        this.creditLimit = data().deepCopy(fields()[12].schema(), other.creditLimit);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.__deleted)) {
        this.__deleted = data().deepCopy(fields()[13].schema(), other.__deleted);
        fieldSetFlags()[13] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Customer instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.model.Customer other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.customerNumber)) {
        this.customerNumber = data().deepCopy(fields()[0].schema(), other.customerNumber);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customerName)) {
        this.customerName = data().deepCopy(fields()[1].schema(), other.customerName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.contactLastName)) {
        this.contactLastName = data().deepCopy(fields()[2].schema(), other.contactLastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contactFirstName)) {
        this.contactFirstName = data().deepCopy(fields()[3].schema(), other.contactFirstName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.phone)) {
        this.phone = data().deepCopy(fields()[4].schema(), other.phone);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.addressLine1)) {
        this.addressLine1 = data().deepCopy(fields()[5].schema(), other.addressLine1);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.addressLine2)) {
        this.addressLine2 = data().deepCopy(fields()[6].schema(), other.addressLine2);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.city)) {
        this.city = data().deepCopy(fields()[7].schema(), other.city);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.state)) {
        this.state = data().deepCopy(fields()[8].schema(), other.state);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.postalCode)) {
        this.postalCode = data().deepCopy(fields()[9].schema(), other.postalCode);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.country)) {
        this.country = data().deepCopy(fields()[10].schema(), other.country);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.salesRepEmployeeNumber)) {
        this.salesRepEmployeeNumber = data().deepCopy(fields()[11].schema(), other.salesRepEmployeeNumber);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.creditLimit)) {
        this.creditLimit = data().deepCopy(fields()[12].schema(), other.creditLimit);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.__deleted)) {
        this.__deleted = data().deepCopy(fields()[13].schema(), other.__deleted);
        fieldSetFlags()[13] = true;
      }
    }

    /**
      * Gets the value of the 'customerNumber' field.
      * @return The value.
      */
    public java.lang.Integer getCustomerNumber() {
      return customerNumber;
    }

    /**
      * Sets the value of the 'customerNumber' field.
      * @param value The value of 'customerNumber'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setCustomerNumber(int value) {
      validate(fields()[0], value);
      this.customerNumber = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'customerNumber' field has been set.
      * @return True if the 'customerNumber' field has been set, false otherwise.
      */
    public boolean hasCustomerNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'customerNumber' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearCustomerNumber() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'customerName' field.
      * @return The value.
      */
    public java.lang.CharSequence getCustomerName() {
      return customerName;
    }

    /**
      * Sets the value of the 'customerName' field.
      * @param value The value of 'customerName'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setCustomerName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.customerName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'customerName' field has been set.
      * @return True if the 'customerName' field has been set, false otherwise.
      */
    public boolean hasCustomerName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'customerName' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearCustomerName() {
      customerName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'contactLastName' field.
      * @return The value.
      */
    public java.lang.CharSequence getContactLastName() {
      return contactLastName;
    }

    /**
      * Sets the value of the 'contactLastName' field.
      * @param value The value of 'contactLastName'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setContactLastName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.contactLastName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'contactLastName' field has been set.
      * @return True if the 'contactLastName' field has been set, false otherwise.
      */
    public boolean hasContactLastName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'contactLastName' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearContactLastName() {
      contactLastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'contactFirstName' field.
      * @return The value.
      */
    public java.lang.CharSequence getContactFirstName() {
      return contactFirstName;
    }

    /**
      * Sets the value of the 'contactFirstName' field.
      * @param value The value of 'contactFirstName'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setContactFirstName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.contactFirstName = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'contactFirstName' field has been set.
      * @return True if the 'contactFirstName' field has been set, false otherwise.
      */
    public boolean hasContactFirstName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'contactFirstName' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearContactFirstName() {
      contactFirstName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'phone' field.
      * @return The value.
      */
    public java.lang.CharSequence getPhone() {
      return phone;
    }

    /**
      * Sets the value of the 'phone' field.
      * @param value The value of 'phone'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setPhone(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.phone = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'phone' field has been set.
      * @return True if the 'phone' field has been set, false otherwise.
      */
    public boolean hasPhone() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'phone' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearPhone() {
      phone = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'addressLine1' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddressLine1() {
      return addressLine1;
    }

    /**
      * Sets the value of the 'addressLine1' field.
      * @param value The value of 'addressLine1'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setAddressLine1(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.addressLine1 = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'addressLine1' field has been set.
      * @return True if the 'addressLine1' field has been set, false otherwise.
      */
    public boolean hasAddressLine1() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'addressLine1' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearAddressLine1() {
      addressLine1 = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'addressLine2' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddressLine2() {
      return addressLine2;
    }

    /**
      * Sets the value of the 'addressLine2' field.
      * @param value The value of 'addressLine2'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setAddressLine2(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.addressLine2 = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'addressLine2' field has been set.
      * @return True if the 'addressLine2' field has been set, false otherwise.
      */
    public boolean hasAddressLine2() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'addressLine2' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearAddressLine2() {
      addressLine2 = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * @return The value.
      */
    public java.lang.CharSequence getCity() {
      return city;
    }

    /**
      * Sets the value of the 'city' field.
      * @param value The value of 'city'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.city = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearCity() {
      city = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public java.lang.CharSequence getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setState(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.state = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearState() {
      state = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'postalCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getPostalCode() {
      return postalCode;
    }

    /**
      * Sets the value of the 'postalCode' field.
      * @param value The value of 'postalCode'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setPostalCode(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.postalCode = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'postalCode' field has been set.
      * @return True if the 'postalCode' field has been set, false otherwise.
      */
    public boolean hasPostalCode() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'postalCode' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearPostalCode() {
      postalCode = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'country' field.
      * @return The value.
      */
    public java.lang.CharSequence getCountry() {
      return country;
    }

    /**
      * Sets the value of the 'country' field.
      * @param value The value of 'country'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setCountry(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.country = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'country' field has been set.
      * @return True if the 'country' field has been set, false otherwise.
      */
    public boolean hasCountry() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'country' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearCountry() {
      country = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'salesRepEmployeeNumber' field.
      * @return The value.
      */
    public java.lang.Integer getSalesRepEmployeeNumber() {
      return salesRepEmployeeNumber;
    }

    /**
      * Sets the value of the 'salesRepEmployeeNumber' field.
      * @param value The value of 'salesRepEmployeeNumber'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setSalesRepEmployeeNumber(java.lang.Integer value) {
      validate(fields()[11], value);
      this.salesRepEmployeeNumber = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'salesRepEmployeeNumber' field has been set.
      * @return True if the 'salesRepEmployeeNumber' field has been set, false otherwise.
      */
    public boolean hasSalesRepEmployeeNumber() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'salesRepEmployeeNumber' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearSalesRepEmployeeNumber() {
      salesRepEmployeeNumber = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'creditLimit' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getCreditLimit() {
      return creditLimit;
    }

    /**
      * Sets the value of the 'creditLimit' field.
      * @param value The value of 'creditLimit'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setCreditLimit(java.nio.ByteBuffer value) {
      validate(fields()[12], value);
      this.creditLimit = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'creditLimit' field has been set.
      * @return True if the 'creditLimit' field has been set, false otherwise.
      */
    public boolean hasCreditLimit() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'creditLimit' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearCreditLimit() {
      creditLimit = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the '__deleted' field.
      * @return The value.
      */
    public java.lang.CharSequence getDeleted$1() {
      return __deleted;
    }

    /**
      * Sets the value of the '__deleted' field.
      * @param value The value of '__deleted'.
      * @return This builder.
      */
    public com.example.model.Customer.Builder setDeleted$1(java.lang.CharSequence value) {
      validate(fields()[13], value);
      this.__deleted = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the '__deleted' field has been set.
      * @return True if the '__deleted' field has been set, false otherwise.
      */
    public boolean hasDeleted$1() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the '__deleted' field.
      * @return This builder.
      */
    public com.example.model.Customer.Builder clearDeleted$1() {
      __deleted = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Customer build() {
      try {
        Customer record = new Customer();
        record.customerNumber = fieldSetFlags()[0] ? this.customerNumber : (java.lang.Integer) defaultValue(fields()[0]);
        record.customerName = fieldSetFlags()[1] ? this.customerName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.contactLastName = fieldSetFlags()[2] ? this.contactLastName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.contactFirstName = fieldSetFlags()[3] ? this.contactFirstName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.phone = fieldSetFlags()[4] ? this.phone : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.addressLine1 = fieldSetFlags()[5] ? this.addressLine1 : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.addressLine2 = fieldSetFlags()[6] ? this.addressLine2 : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.city = fieldSetFlags()[7] ? this.city : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.state = fieldSetFlags()[8] ? this.state : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.postalCode = fieldSetFlags()[9] ? this.postalCode : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.country = fieldSetFlags()[10] ? this.country : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.salesRepEmployeeNumber = fieldSetFlags()[11] ? this.salesRepEmployeeNumber : (java.lang.Integer) defaultValue(fields()[11]);
        record.creditLimit = fieldSetFlags()[12] ? this.creditLimit : (java.nio.ByteBuffer) defaultValue(fields()[12]);
        record.__deleted = fieldSetFlags()[13] ? this.__deleted : (java.lang.CharSequence) defaultValue(fields()[13]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Customer>
    WRITER$ = (org.apache.avro.io.DatumWriter<Customer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Customer>
    READER$ = (org.apache.avro.io.DatumReader<Customer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
