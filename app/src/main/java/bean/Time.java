package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Time implements Serializable {
    private static final Long serialVersionUID = 1L;
    private Long id;
    private Date date;
    private int NbrHeures;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNbrHeures() {
        return NbrHeures;
    }

    public void setNbrHeures(int nbrHeures) {
        NbrHeures = nbrHeures;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return Objects.equals(id, time.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", date=" + date +
                ", NbrHeures=" + NbrHeures +
                '}';
    }
}
