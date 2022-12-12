public class Student {
    String name;
    int idnumber;
    int age;
    String address;

    public Student (){

    }

    public Student (String name, int idnumber , int age , String address){
            this.name = name;
            this.idnumber = idnumber;
            this.age = age;
            this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
