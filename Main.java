class Main {
  public static void main(String[] args) {

    System.out.println("Hallo Robert");
    
    Zahlenfilter zahlenfilter = new Zahlenfilter();
    
    for(int i = 0; i < 200; i++) {
      zahlenfilter.isDividedByFive(i);
      zahlenfilter.lastDigitNine(i);
      zahlenfilter.AncestorDividedByNine(i);
    }
    
    
   
  }
}