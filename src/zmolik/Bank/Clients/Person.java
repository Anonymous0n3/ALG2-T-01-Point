package zmolik.Bank.Clients;

public class Person extends Client{

    public Person(String name) {
        super(name);
    }

    @Override
    public String fullAdress() {
        if(name.length() >= 3 && name.charAt(name.length()-3) == 'o' && name.charAt(name.length()-2) == 'v' && name.charAt(name.length()-1) == 'a'){
            return "Paní " + name;
        } else{
            return "Pan " + name;
        }
    }
}
