package DDD;

public class BaseDecorator extends Notifier {
    protected Notifier wrappe;

    public  BaseDecorator(Notifier wrappe ){
        this.wrappe = wrappe;
    }


    public void sendMessage() {
        wrappe.sendMessage();

    }



}
