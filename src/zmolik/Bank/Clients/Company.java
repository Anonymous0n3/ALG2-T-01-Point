package zmolik.Bank.Clients;

public class Company extends Client{

        public Company(String name) {
            super(name);
        }

        @Override
        public String fullAdress() {
            return "Firma " + name;
        }
}
