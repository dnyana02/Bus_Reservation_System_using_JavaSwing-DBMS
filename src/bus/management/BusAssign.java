/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author dnyansiddh
 */
@Entity
@Table(name = "bus_assign")
@NamedQueries({
    @NamedQuery(name = "BusAssign.findAll", query = "SELECT b FROM BusAssign b"),
    @NamedQuery(name = "BusAssign.findByAid", query = "SELECT b FROM BusAssign b WHERE b.aid = :aid"),
    @NamedQuery(name = "BusAssign.findByEmployeeNo", query = "SELECT b FROM BusAssign b WHERE b.employeeNo = :employeeNo"),
    @NamedQuery(name = "BusAssign.findByBusNo", query = "SELECT b FROM BusAssign b WHERE b.busNo = :busNo")})
public class BusAssign implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "aid")
    private Integer aid;
    @Basic(optional = false)
    @Column(name = "employee_no")
    private String employeeNo;
    @Basic(optional = false)
    @Column(name = "bus_no")
    private String busNo;

    public BusAssign() {
    }

    public BusAssign(Integer aid) {
        this.aid = aid;
    }

    public BusAssign(Integer aid, String employeeNo, String busNo) {
        this.aid = aid;
        this.employeeNo = employeeNo;
        this.busNo = busNo;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aid != null ? aid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusAssign)) {
            return false;
        }
        BusAssign other = (BusAssign) object;
        if ((this.aid == null && other.aid != null) || (this.aid != null && !this.aid.equals(other.aid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.management.BusAssign[ aid=" + aid + " ]";
    }
    
}
