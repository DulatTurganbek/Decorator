package DDD;

public class Facebook_Decorator extends BaseDecorator {


    public Facebook_Decorator(Notifier wrappe) {
        super(wrappe);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
    }

    public void sendFacebookMessage(){
        System.out.println("This is the Facebook message!!!");
    }
}
