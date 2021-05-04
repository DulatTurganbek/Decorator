package DDD;

public class Slack_Decorator extends BaseDecorator{


    public Slack_Decorator(Notifier wrappe) {
        super(wrappe);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
    }
    public void sendSlackMessage(){
        System.out.println("This is the slack message!!!");
    }
}
