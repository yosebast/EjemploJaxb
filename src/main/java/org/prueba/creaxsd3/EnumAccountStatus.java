
package org.prueba.creaxsd3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EnumAccountStatus")
@XmlEnum
public enum EnumAccountStatus {

	@XmlEnumValue("Active") ACTIVE("Active"), @XmlEnumValue("Inactive") INACTIVE("Inactive");

	private final String value;

	EnumAccountStatus(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static EnumAccountStatus fromValue(String v) {
		for (EnumAccountStatus c : EnumAccountStatus.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
