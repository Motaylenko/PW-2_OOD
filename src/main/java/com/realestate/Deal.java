/**
 * Клас угоди з нерухомістю
 */
public class Deal {
    private int id;
    
    public Deal(int id, String date) {
        this.id = id;
        this.date = date;
        this.status = "Нова";
    }
    
    public void confirm() {
        System.out.println("Угода #" + id + " підтверджена");
        this.status = "Підтверджена";
    }
    
    public void cancel() {
        System.out.println("Угода #" + id + " скасована");
        this.status = "Скасована";
    }
    
    public void setSeller(Seller seller) {
        this.seller = seller;
    }
    
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
    
    public void setAgent(Agent agent) {
        this.agent = agent;
    }
    
    public void setBank(Bank bank) {
        this.bank = bank;
    }
}