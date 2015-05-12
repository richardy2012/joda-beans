/*
 *  Copyright 2001-2014 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.DerivedProperty;
import org.joda.beans.ImmutableBean;
import org.joda.beans.ImmutableDefaults;
import org.joda.beans.ImmutablePreBuild;
import org.joda.beans.ImmutableValidator;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;

/**
 * Mock immutable person JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(cacheHashCode = true)
public final class ImmPerson implements ImmutableBean {

    /** The forename. */
    @PropertyDefinition
    private final String forename;
    /** The surname. */
    @PropertyDefinition
    private final String surname;
    /** The number of cars. */
    @PropertyDefinition
    private transient final int numberOfCars;
    /** The date of birth. */
    @PropertyDefinition
    private transient final Date dateOfBirth;
    /** The middle names. */
    @PropertyDefinition
    private transient final String[] middleNames;
    @PropertyDefinition
    private final ImmutableList<Address> addressList;
    @PropertyDefinition
    private final Map<String, Address> otherAddressMap;
    @PropertyDefinition
    private final List<List<Address>> addressesList;
    @PropertyDefinition
    private final ImmAddress mainAddress;
    @PropertyDefinition
    private final ImmutableMultiset<String> codeCounts;

    @DerivedProperty
    public int getAge() {
        return 12;
    }

    @ImmutableValidator
    private void validate() {
        if (getSurname() == null && getForename() == null) {
            throw new IllegalArgumentException();
        }
    }

    @ImmutableDefaults
    private static void applyDefaults(Builder builder) {
        builder.numberOfCars(1);  // default numberOfCars to one
    }

    @ImmutablePreBuild
    private static void preBuild(Builder builder) {
        if (builder.middleNames == null) {
            builder.middleNames = new String[0];
        }
    }

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code ImmPerson}.
     * @return the meta-bean, not null
     */
    public static ImmPerson.Meta meta() {
        return ImmPerson.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(ImmPerson.Meta.INSTANCE);
    }

    /**
     * The cached hash code, using the racy single-check idiom.
     */
    private int cachedHashCode;

    /**
     * Returns a builder used to create an instance of the bean.
     * @return the builder, not null
     */
    public static ImmPerson.Builder builder() {
        return new ImmPerson.Builder();
    }

    private ImmPerson(
            String forename,
            String surname,
            int numberOfCars,
            Date dateOfBirth,
            String[] middleNames,
            List<? extends Address> addressList,
            Map<String, ? extends Address> otherAddressMap,
            List<List<Address>> addressesList,
            ImmAddress mainAddress,
            Multiset<String> codeCounts) {
        this.forename = forename;
        this.surname = surname;
        this.numberOfCars = numberOfCars;
        this.dateOfBirth = (dateOfBirth != null ? (Date) dateOfBirth.clone() : null);
        this.middleNames = (middleNames != null ? middleNames.clone() : null);
        this.addressList = (addressList != null ? ImmutableList.copyOf(addressList) : null);
        this.otherAddressMap = (otherAddressMap != null ? ImmutableMap.copyOf(otherAddressMap) : null);
        this.addressesList = (addressesList != null ? ImmutableList.copyOf(addressesList) : null);
        this.mainAddress = mainAddress;
        this.codeCounts = (codeCounts != null ? ImmutableMultiset.copyOf(codeCounts) : null);
        validate();
    }

    @Override
    public ImmPerson.Meta metaBean() {
        return ImmPerson.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the forename.
     * @return the value of the property
     */
    public String getForename() {
        return forename;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the surname.
     * @return the value of the property
     */
    public String getSurname() {
        return surname;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number of cars.
     * @return the value of the property
     */
    public int getNumberOfCars() {
        return numberOfCars;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the date of birth.
     * @return the value of the property
     */
    public Date getDateOfBirth() {
        return (dateOfBirth != null ? (Date) dateOfBirth.clone() : null);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the middle names.
     * @return the value of the property
     */
    public String[] getMiddleNames() {
        return (middleNames != null ? middleNames.clone() : null);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the addressList.
     * @return the value of the property
     */
    public ImmutableList<Address> getAddressList() {
        return addressList;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the otherAddressMap.
     * @return the value of the property
     */
    public Map<String, Address> getOtherAddressMap() {
        return otherAddressMap;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the addressesList.
     * @return the value of the property
     */
    public List<List<Address>> getAddressesList() {
        return addressesList;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the mainAddress.
     * @return the value of the property
     */
    public ImmAddress getMainAddress() {
        return mainAddress;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the codeCounts.
     * @return the value of the property
     */
    public ImmutableMultiset<String> getCodeCounts() {
        return codeCounts;
    }

    //-----------------------------------------------------------------------
    /**
     * Returns a builder that allows this bean to be mutated.
     * @return the mutable builder, not null
     */
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            ImmPerson other = (ImmPerson) obj;
            return JodaBeanUtils.equal(getForename(), other.getForename()) &&
                    JodaBeanUtils.equal(getSurname(), other.getSurname()) &&
                    (getNumberOfCars() == other.getNumberOfCars()) &&
                    JodaBeanUtils.equal(getDateOfBirth(), other.getDateOfBirth()) &&
                    JodaBeanUtils.equal(getMiddleNames(), other.getMiddleNames()) &&
                    JodaBeanUtils.equal(getAddressList(), other.getAddressList()) &&
                    JodaBeanUtils.equal(getOtherAddressMap(), other.getOtherAddressMap()) &&
                    JodaBeanUtils.equal(getAddressesList(), other.getAddressesList()) &&
                    JodaBeanUtils.equal(getMainAddress(), other.getMainAddress()) &&
                    JodaBeanUtils.equal(getCodeCounts(), other.getCodeCounts());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = cachedHashCode;
        if (hash == 0) {
            hash = getClass().hashCode();
            hash = hash * 31 + JodaBeanUtils.hashCode(getForename());
            hash = hash * 31 + JodaBeanUtils.hashCode(getSurname());
            hash = hash * 31 + JodaBeanUtils.hashCode(getNumberOfCars());
            hash = hash * 31 + JodaBeanUtils.hashCode(getDateOfBirth());
            hash = hash * 31 + JodaBeanUtils.hashCode(getMiddleNames());
            hash = hash * 31 + JodaBeanUtils.hashCode(getAddressList());
            hash = hash * 31 + JodaBeanUtils.hashCode(getOtherAddressMap());
            hash = hash * 31 + JodaBeanUtils.hashCode(getAddressesList());
            hash = hash * 31 + JodaBeanUtils.hashCode(getMainAddress());
            hash = hash * 31 + JodaBeanUtils.hashCode(getCodeCounts());
            cachedHashCode = hash;
        }
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(384);
        buf.append("ImmPerson{");
        buf.append("forename").append('=').append(getForename()).append(',').append(' ');
        buf.append("surname").append('=').append(getSurname()).append(',').append(' ');
        buf.append("numberOfCars").append('=').append(getNumberOfCars()).append(',').append(' ');
        buf.append("dateOfBirth").append('=').append(getDateOfBirth()).append(',').append(' ');
        buf.append("middleNames").append('=').append(getMiddleNames()).append(',').append(' ');
        buf.append("addressList").append('=').append(getAddressList()).append(',').append(' ');
        buf.append("otherAddressMap").append('=').append(getOtherAddressMap()).append(',').append(' ');
        buf.append("addressesList").append('=').append(getAddressesList()).append(',').append(' ');
        buf.append("mainAddress").append('=').append(getMainAddress()).append(',').append(' ');
        buf.append("codeCounts").append('=').append(getCodeCounts()).append(',').append(' ');
        buf.append("age").append('=').append(JodaBeanUtils.toString(getAge()));
        buf.append('}');
        return buf.toString();
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code ImmPerson}.
     */
    public static final class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code forename} property.
         */
        private final MetaProperty<String> forename = DirectMetaProperty.ofImmutable(
                this, "forename", ImmPerson.class, String.class);
        /**
         * The meta-property for the {@code surname} property.
         */
        private final MetaProperty<String> surname = DirectMetaProperty.ofImmutable(
                this, "surname", ImmPerson.class, String.class);
        /**
         * The meta-property for the {@code numberOfCars} property.
         */
        private final MetaProperty<Integer> numberOfCars = DirectMetaProperty.ofImmutable(
                this, "numberOfCars", ImmPerson.class, Integer.TYPE);
        /**
         * The meta-property for the {@code dateOfBirth} property.
         */
        private final MetaProperty<Date> dateOfBirth = DirectMetaProperty.ofImmutable(
                this, "dateOfBirth", ImmPerson.class, Date.class);
        /**
         * The meta-property for the {@code middleNames} property.
         */
        private final MetaProperty<String[]> middleNames = DirectMetaProperty.ofImmutable(
                this, "middleNames", ImmPerson.class, String[].class);
        /**
         * The meta-property for the {@code addressList} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableList<Address>> addressList = DirectMetaProperty.ofImmutable(
                this, "addressList", ImmPerson.class, (Class) ImmutableList.class);
        /**
         * The meta-property for the {@code otherAddressMap} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Map<String, Address>> otherAddressMap = DirectMetaProperty.ofImmutable(
                this, "otherAddressMap", ImmPerson.class, (Class) Map.class);
        /**
         * The meta-property for the {@code addressesList} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<List<Address>>> addressesList = DirectMetaProperty.ofImmutable(
                this, "addressesList", ImmPerson.class, (Class) List.class);
        /**
         * The meta-property for the {@code mainAddress} property.
         */
        private final MetaProperty<ImmAddress> mainAddress = DirectMetaProperty.ofImmutable(
                this, "mainAddress", ImmPerson.class, ImmAddress.class);
        /**
         * The meta-property for the {@code codeCounts} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<ImmutableMultiset<String>> codeCounts = DirectMetaProperty.ofImmutable(
                this, "codeCounts", ImmPerson.class, (Class) ImmutableMultiset.class);
        /**
         * The meta-property for the {@code age} property.
         */
        private final MetaProperty<Integer> age = DirectMetaProperty.ofDerived(
                this, "age", ImmPerson.class, Integer.TYPE);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "forename",
                "surname",
                "numberOfCars",
                "dateOfBirth",
                "middleNames",
                "addressList",
                "otherAddressMap",
                "addressesList",
                "mainAddress",
                "codeCounts",
                "age");

        /**
         * Restricted constructor.
         */
        private Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    return forename;
                case -1852993317:  // surname
                    return surname;
                case 926656063:  // numberOfCars
                    return numberOfCars;
                case -386871910:  // dateOfBirth
                    return dateOfBirth;
                case 404996787:  // middleNames
                    return middleNames;
                case -1377524046:  // addressList
                    return addressList;
                case 1368089592:  // otherAddressMap
                    return otherAddressMap;
                case -226885792:  // addressesList
                    return addressesList;
                case -2032731141:  // mainAddress
                    return mainAddress;
                case -1383758447:  // codeCounts
                    return codeCounts;
                case 96511:  // age
                    return age;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public ImmPerson.Builder builder() {
            return new ImmPerson.Builder();
        }

        @Override
        public Class<? extends ImmPerson> beanType() {
            return ImmPerson.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code forename} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String> forename() {
            return forename;
        }

        /**
         * The meta-property for the {@code surname} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String> surname() {
            return surname;
        }

        /**
         * The meta-property for the {@code numberOfCars} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Integer> numberOfCars() {
            return numberOfCars;
        }

        /**
         * The meta-property for the {@code dateOfBirth} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Date> dateOfBirth() {
            return dateOfBirth;
        }

        /**
         * The meta-property for the {@code middleNames} property.
         * @return the meta-property, not null
         */
        public MetaProperty<String[]> middleNames() {
            return middleNames;
        }

        /**
         * The meta-property for the {@code addressList} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableList<Address>> addressList() {
            return addressList;
        }

        /**
         * The meta-property for the {@code otherAddressMap} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Map<String, Address>> otherAddressMap() {
            return otherAddressMap;
        }

        /**
         * The meta-property for the {@code addressesList} property.
         * @return the meta-property, not null
         */
        public MetaProperty<List<List<Address>>> addressesList() {
            return addressesList;
        }

        /**
         * The meta-property for the {@code mainAddress} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmAddress> mainAddress() {
            return mainAddress;
        }

        /**
         * The meta-property for the {@code codeCounts} property.
         * @return the meta-property, not null
         */
        public MetaProperty<ImmutableMultiset<String>> codeCounts() {
            return codeCounts;
        }

        /**
         * The meta-property for the {@code age} property.
         * @return the meta-property, not null
         */
        public MetaProperty<Integer> age() {
            return age;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    return ((ImmPerson) bean).getForename();
                case -1852993317:  // surname
                    return ((ImmPerson) bean).getSurname();
                case 926656063:  // numberOfCars
                    return ((ImmPerson) bean).getNumberOfCars();
                case -386871910:  // dateOfBirth
                    return ((ImmPerson) bean).getDateOfBirth();
                case 404996787:  // middleNames
                    return ((ImmPerson) bean).getMiddleNames();
                case -1377524046:  // addressList
                    return ((ImmPerson) bean).getAddressList();
                case 1368089592:  // otherAddressMap
                    return ((ImmPerson) bean).getOtherAddressMap();
                case -226885792:  // addressesList
                    return ((ImmPerson) bean).getAddressesList();
                case -2032731141:  // mainAddress
                    return ((ImmPerson) bean).getMainAddress();
                case -1383758447:  // codeCounts
                    return ((ImmPerson) bean).getCodeCounts();
                case 96511:  // age
                    return ((ImmPerson) bean).getAge();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            metaProperty(propertyName);
            if (quiet) {
                return;
            }
            throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code ImmPerson}.
     */
    public static final class Builder extends DirectFieldsBeanBuilder<ImmPerson> {

        private String forename;
        private String surname;
        private int numberOfCars;
        private Date dateOfBirth;
        private String[] middleNames;
        private List<? extends Address> addressList;
        private Map<String, ? extends Address> otherAddressMap;
        private List<List<Address>> addressesList;
        private ImmAddress mainAddress;
        private Multiset<String> codeCounts;

        /**
         * Restricted constructor.
         */
        private Builder() {
            applyDefaults(this);
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        private Builder(ImmPerson beanToCopy) {
            this.forename = beanToCopy.getForename();
            this.surname = beanToCopy.getSurname();
            this.numberOfCars = beanToCopy.getNumberOfCars();
            this.dateOfBirth = (beanToCopy.getDateOfBirth() != null ? (Date) beanToCopy.getDateOfBirth().clone() : null);
            this.middleNames = (beanToCopy.getMiddleNames() != null ? beanToCopy.getMiddleNames().clone() : null);
            this.addressList = beanToCopy.getAddressList();
            this.otherAddressMap = (beanToCopy.getOtherAddressMap() != null ? ImmutableMap.copyOf(beanToCopy.getOtherAddressMap()) : null);
            this.addressesList = (beanToCopy.getAddressesList() != null ? ImmutableList.copyOf(beanToCopy.getAddressesList()) : null);
            this.mainAddress = beanToCopy.getMainAddress();
            this.codeCounts = beanToCopy.getCodeCounts();
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    return forename;
                case -1852993317:  // surname
                    return surname;
                case 926656063:  // numberOfCars
                    return numberOfCars;
                case -386871910:  // dateOfBirth
                    return dateOfBirth;
                case 404996787:  // middleNames
                    return middleNames;
                case -1377524046:  // addressList
                    return addressList;
                case 1368089592:  // otherAddressMap
                    return otherAddressMap;
                case -226885792:  // addressesList
                    return addressesList;
                case -2032731141:  // mainAddress
                    return mainAddress;
                case -1383758447:  // codeCounts
                    return codeCounts;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public Builder set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    this.forename = (String) newValue;
                    break;
                case -1852993317:  // surname
                    this.surname = (String) newValue;
                    break;
                case 926656063:  // numberOfCars
                    this.numberOfCars = (Integer) newValue;
                    break;
                case -386871910:  // dateOfBirth
                    this.dateOfBirth = (Date) newValue;
                    break;
                case 404996787:  // middleNames
                    this.middleNames = (String[]) newValue;
                    break;
                case -1377524046:  // addressList
                    this.addressList = (List<? extends Address>) newValue;
                    break;
                case 1368089592:  // otherAddressMap
                    this.otherAddressMap = (Map<String, ? extends Address>) newValue;
                    break;
                case -226885792:  // addressesList
                    this.addressesList = (List<List<Address>>) newValue;
                    break;
                case -2032731141:  // mainAddress
                    this.mainAddress = (ImmAddress) newValue;
                    break;
                case -1383758447:  // codeCounts
                    this.codeCounts = (Multiset<String>) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        @Override
        public Builder setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        @Override
        public Builder setString(MetaProperty<?> property, String value) {
            super.setString(property, value);
            return this;
        }

        @Override
        public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public ImmPerson build() {
            preBuild(this);
            return new ImmPerson(
                    forename,
                    surname,
                    numberOfCars,
                    dateOfBirth,
                    middleNames,
                    addressList,
                    otherAddressMap,
                    addressesList,
                    mainAddress,
                    codeCounts);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the forename.
         * @param forename  the new value
         * @return this, for chaining, not null
         */
        public Builder forename(String forename) {
            this.forename = forename;
            return this;
        }

        /**
         * Sets the surname.
         * @param surname  the new value
         * @return this, for chaining, not null
         */
        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        /**
         * Sets the number of cars.
         * @param numberOfCars  the new value
         * @return this, for chaining, not null
         */
        public Builder numberOfCars(int numberOfCars) {
            this.numberOfCars = numberOfCars;
            return this;
        }

        /**
         * Sets the date of birth.
         * @param dateOfBirth  the new value
         * @return this, for chaining, not null
         */
        public Builder dateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * Sets the middle names.
         * @param middleNames  the new value
         * @return this, for chaining, not null
         */
        public Builder middleNames(String... middleNames) {
            this.middleNames = middleNames;
            return this;
        }

        /**
         * Sets the addressList.
         * @param addressList  the new value
         * @return this, for chaining, not null
         */
        public Builder addressList(List<? extends Address> addressList) {
            this.addressList = addressList;
            return this;
        }

        /**
         * Sets the {@code addressList} property in the builder
         * from an array of objects.
         * @param addressList  the new value
         * @return this, for chaining, not null
         */
        public Builder addressList(Address... addressList) {
            return addressList(ImmutableList.copyOf(addressList));
        }

        /**
         * Sets the otherAddressMap.
         * @param otherAddressMap  the new value
         * @return this, for chaining, not null
         */
        public Builder otherAddressMap(Map<String, ? extends Address> otherAddressMap) {
            this.otherAddressMap = otherAddressMap;
            return this;
        }

        /**
         * Sets the addressesList.
         * @param addressesList  the new value
         * @return this, for chaining, not null
         */
        public Builder addressesList(List<List<Address>> addressesList) {
            this.addressesList = addressesList;
            return this;
        }

        /**
         * Sets the {@code addressesList} property in the builder
         * from an array of objects.
         * @param addressesList  the new value
         * @return this, for chaining, not null
         */
        public Builder addressesList(List<Address>... addressesList) {
            return addressesList(ImmutableList.copyOf(addressesList));
        }

        /**
         * Sets the mainAddress.
         * @param mainAddress  the new value
         * @return this, for chaining, not null
         */
        public Builder mainAddress(ImmAddress mainAddress) {
            this.mainAddress = mainAddress;
            return this;
        }

        /**
         * Sets the codeCounts.
         * @param codeCounts  the new value
         * @return this, for chaining, not null
         */
        public Builder codeCounts(Multiset<String> codeCounts) {
            this.codeCounts = codeCounts;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(352);
            buf.append("ImmPerson.Builder{");
            buf.append("forename").append('=').append(JodaBeanUtils.toString(forename)).append(',').append(' ');
            buf.append("surname").append('=').append(JodaBeanUtils.toString(surname)).append(',').append(' ');
            buf.append("numberOfCars").append('=').append(JodaBeanUtils.toString(numberOfCars)).append(',').append(' ');
            buf.append("dateOfBirth").append('=').append(JodaBeanUtils.toString(dateOfBirth)).append(',').append(' ');
            buf.append("middleNames").append('=').append(JodaBeanUtils.toString(middleNames)).append(',').append(' ');
            buf.append("addressList").append('=').append(JodaBeanUtils.toString(addressList)).append(',').append(' ');
            buf.append("otherAddressMap").append('=').append(JodaBeanUtils.toString(otherAddressMap)).append(',').append(' ');
            buf.append("addressesList").append('=').append(JodaBeanUtils.toString(addressesList)).append(',').append(' ');
            buf.append("mainAddress").append('=').append(JodaBeanUtils.toString(mainAddress)).append(',').append(' ');
            buf.append("codeCounts").append('=').append(JodaBeanUtils.toString(codeCounts));
            buf.append('}');
            return buf.toString();
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
