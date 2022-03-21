public class student {
    String fullname,address,email;
    int id;
    public student(){

    }
    public student(int id,String fullname,String address,String email){
        this.id = id;
        this.fullname = fullname;
        this.address = address;
        this.email = email;
    }
    public student(String fullname, String address, String email) {
        this.fullname = fullname;
        this.address = address;
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}