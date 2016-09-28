class remove{

    public static void main(String[] args){

      //missingChar("Robocop", 4);
      //notString("semicolon");
      //notString("not semicolon");
      //frontback("heisenberg");
      //stringManipulation();

      notString(args[0]);

    }

    private static void stringManipulation(){
          String str = "http://www.academiadecodigo.org";

          String domain = ""; // www.academiadecodigo.org
          String name = "";   // < Academia de Codigo_ >
          String tempName;
          String var1, var2, var3;

          int lastSlash, firstDot, lastDot;
          lastSlash = str.lastIndexOf("/");
          firstDot = str.indexOf(".");
          lastDot = str.lastIndexOf(".");

          tempName = str.substring(firstDot+1, lastDot);
          domain = str.substring(lastSlash+1);

          //System.out.println(domain);
          //System.out.println(tempName);

          var1 = tempName.substring(0, tempName.lastIndexOf("a")+1); //academia
          var2 = tempName.substring(tempName.lastIndexOf("a")+1, tempName.lastIndexOf("e")+1); //de
          var3 = tempName.substring(tempName.lastIndexOf("e")+1); //codigo

          name = "< " + var1 + " " + var2 + " " + var3 + "_ >";
          name = name.replaceFirst("a", "A");
          name = name.replace("codigo", "Codigo");

          System.out.println("I am a Code Cadet at " + name + ", " + domain);
    }

    private static void missingChar(String str, int n){


      String first, second;

      first = str.substring(0, n);
      second = str.substring(n+1);

      //System.out.println(first + "\n");
      //System.out.println(second);

      System.out.println(first+second);

    }

    private static void notString(String str){

      if (str.startsWith("not"))
        System.out.println(str);
      else
        System.out.println("not " + str);
    }

    private static void frontback(String str){

      char first = str.charAt(0);
      char last = str.charAt(str.length()-1);

      System.out.println(last + str.substring(1, str.length()-1) + first);
    }
}
