package exceptions.ue.transporter;

public class Transporter {

    private boolean malfunction;

    public Transporter() {
        malfunction = false;
    }


    public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException {
        double random = Math.random();
        if (urgent && random < 0.5) {
            malfunction = true;
            throw new TransporterMalfunctionException();
        } else {
            malfunction = false;
            System.out.println(person + " wurde von " + from + " nach " + to + " gebeamt.");
        }
    }

    public void shutdown() {
        System.out.println("Transporter wird heruntergefahren.");
    }

}
