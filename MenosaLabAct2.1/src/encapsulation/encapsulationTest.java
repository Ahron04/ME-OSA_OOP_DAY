
package encapsulation;

public final class encapsulationTest {
    
      private String firstName, lastName;
    private int age;
    public boolean toString;

    public encapsulationTest() {
    }

    public encapsulationTest(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        updateAge();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return firstName + lastName;
    }
    private Boolean isMinor;

    public Boolean getIsMinor() {
        return isMinor;
    }
    public void updateAge(){
        isMinor = age < 18;
    

       }
    public void increment()
    {
        age++;
        updateAge();
    }
    
    @Override
   public String toString(){
       
    return lastName + ", " + firstName + " - " + age + " - " + (isMinor ? "minor" : "adult");
   }
} 



    
