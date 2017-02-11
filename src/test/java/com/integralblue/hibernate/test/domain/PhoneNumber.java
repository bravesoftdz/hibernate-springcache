/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */

package com.integralblue.hibernate.test.domain;

import java.io.Serializable;

/**
 * PhoneNumber
 */
@SuppressWarnings("serial")
public class PhoneNumber implements Serializable {
	private long personId = 0;
	private String numberType = "home";
	private long phone = 0;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getNumberType() {
		return numberType;
	}

	public void setNumberType(String numberType) {
		this.numberType = numberType;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
						 + ((numberType == null) ? 0 : numberType.hashCode());
		result = prime * result + (int)(personId ^ (personId >>> 32));
		result = prime * result + (int)(phone ^ (phone >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final PhoneNumber other = (PhoneNumber)obj;
		if (numberType == null) {
			if (other.numberType != null)
				return false;
		} else if (!numberType.equals(other.numberType))
			return false;
		if (personId != other.personId)
			return false;
		if (phone != other.phone)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return numberType + ":" + phone;
	}

}
