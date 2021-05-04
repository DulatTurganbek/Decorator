package DDD;

public class SMS_Decorator extends BaseDecorator{


    public SMS_Decorator(Notifier wrappe) {
        super(wrappe);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
    }

    public void sendSMS(){
        System.out.println("This is the sms message!!!");
    }
}
