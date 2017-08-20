package com.cdac.gist.mapping.inherientence;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import org.hibernate.annotations.NamedQuery;

import com.cdac.gist.mapping.inherientence.tableperhierarchy.Employee;

/**
 *
 * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
 */

@Entity
//@DiscriminatorValue(value = "regular_employee")
//@AttributeOverrides(value = {
//    @AttributeOverride(name = "id",column = @Column(name = "id")),
//    @AttributeOverride(name = "name",column = @Column(name = "name"))
//})
@PrimaryKeyJoinColumn(name = "id")
public class Regular_Employee extends Employee {

    public Regular_Employee() {
    }

    @Column(name = "salary")
    private float salary;

    @Column(name = "bonus")
    private int bonus;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Regular_Employee{" + "salary=" + salary + ", bonus=" + bonus + '}' + super.toString();
    }

}
