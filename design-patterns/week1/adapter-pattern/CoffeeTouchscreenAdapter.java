public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    
    OldCoffeeMachine theMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine ocMachine) {
        theMachine = ocMachine;
    }

    public void chooseFirstSelection() {
        theMachine.selectA();
    }

     public void chooseSecondSelection() {
        theMachine.selectB();
    }
    
    public static void main(String args[]) {
        OldCoffeeMachine ocm = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter cta = new CoffeeTouchscreenAdapter(ocm);
        cta.chooseFirstSelection();
        cta.chooseSecondSelection();
    }
    
}
