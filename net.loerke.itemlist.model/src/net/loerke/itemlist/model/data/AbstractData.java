package net.loerke.itemlist.model.data;

import java.math.BigInteger;
import java.util.UUID;

import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlDiscriminatorNode;

@XmlRootElement(name="base")
@XmlDiscriminatorNode("@basetype")
public abstract class AbstractData {

	private String m_name;
	private BigInteger m_id;

	/**
	 * needed by persistence API
	 */
	protected AbstractData() {
		// do nothing
	}
	
	protected AbstractData(String name) {
		initID();
		setName(name);
	}
	
	/**
	 * initialize the universal ID for this entity
	 */
	protected void initID() {
		UUID uuid = UUID.randomUUID();
		BigInteger id = BigInteger.valueOf(uuid.getMostSignificantBits());
		id.shiftLeft(64);
		id.or(BigInteger.valueOf(uuid.getLeastSignificantBits()));
		setId(id);
	}

	/**
	 * @return the id
	 */
	@XmlID
	public BigInteger getId() {
		return m_id;
	}

	/**
	 * @param id the id to set
	 */
	protected void setId(BigInteger id) {
		m_id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return m_name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		m_name = name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbstractNode [m_name=" + m_name + "]";
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AbstractData)) {
			return false;
		}
		AbstractData other = (AbstractData) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}

}