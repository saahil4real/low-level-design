//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logger.log(LogProcessor.ERROR, "Error occurred");
        logger.log(LogProcessor.DEBUG, "need to debug");
        logger.log(LogProcessor.INFO, "just for info");
    }
}