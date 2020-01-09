class Main {

  public static double harmony(double n) {
    System.out.println(1/n);

    if(n == 1)
      return 1;

    return 1/n + harmony(n-1);
  }


  public static void main(String[] args) {
    
    System.out.println(harmony(2) + "\t👌");
  }
}

