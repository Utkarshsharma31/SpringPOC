package Collection3;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String name;
    private List<String > phone;
    private Set<String> address;

    private Map<String,String> course;

    private Properties email;

    public Emp(String name, List<String> phone, Set<String> address, Map<String, String> course, Properties email) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.course = course;
        this.email = email;
    }

    public Properties getEmail() {
        return email;
    }

    public void setEmail(Properties email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }



    public Emp() {
        super();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", address=" + address +
                ", course=" + course +
                ", email=" + email +
                '}';
    }
}
