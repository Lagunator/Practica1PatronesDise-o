package exercise9;

public class Numero1234 extends SintaxisRomanos{
    @Override
    public void interpreter(Context context) {
        if (context.getInput().startsWith("1")) {
            context.setOutput(context.getOutput() + "I ");
        } else if (context.getInput().startsWith("2")) {
            context.setOutput(context.getOutput() + "II ");
        } else if (context.getInput().startsWith("3")) {
            context.setOutput(context.getOutput() + "III ");
        } else {
            context.setOutput(context.getOutput() + "IV ");
        }
        context.setInput(context.getInput().substring(1));
    }
}
