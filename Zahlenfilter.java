class Zahlenfilter {

void isDividedByFive(int num) {
  if (num % 5 == 0) {
    System.out.println(num + " ist durch 5 teilbar!");
  }
}

void lastDigitNine(int num) {
  if (num % 10 == 9) {
    System.out.println(num + " endet auf 9!");
  }
}

void AncestorDividedByNine(int num){
  if(num > 0) {
    int ancestor = num - 1;
    int sum = ancestor + num;
    if(sum % 9 == 0) {
      System.out.println(num +":" + ancestor + " ergibt " + sum + " ist durch 9 teilbar!");
    } 
  }
}

}
