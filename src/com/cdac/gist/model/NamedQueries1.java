package com.cdac.gist.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author Kapil Gupta <Kapil gupta at CDAC-GIST,Pune>
 */
@NamedQueries(value = {
    @NamedQuery(name = "GET_EMPLOYEE_BY_ID", query = "from Regular_Employee where id=:id")
})
@NamedNativeQueries({
    @NamedNativeQuery(
            name = "GET_EMPLOYEE_BY_ID_NativeSql",
            query = "select * from Person s where s.id = :id"
    )
})

@Entity
public class NamedQueries1 {

    @Id
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
