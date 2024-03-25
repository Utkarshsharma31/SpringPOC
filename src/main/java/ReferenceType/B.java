package ReferenceType;

public class B {



    private String phone;

    public B(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public B() {
        super();
    }

    @Override
    public String toString() {
        return "B{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
