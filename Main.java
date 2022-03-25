class Main {
  public static void main(String[] args) {

    // Einen leeren Baum erzeugen.
    Element e1 = new Element();

    // e1 ist noch ungültig.
    System.out.println(e1.isValid());

    // "von Hand" einen Wert setzen.
    e1.key = 42;
    e1.value = 500;
    e1.left = new Element();
    e1.right = new Element();

    // Jetzt ist e1 gültig.
    System.out.println(e1.isValid());

    e1.left.key = 38;
    e1.left.value = 1024;
    e1.left.left = new Element();
    e1.left.right = new Element();

    // weitere Elemente
    e1.right.key = 77;
    e1.right.value = 2048;
    e1.right.left = new Element();
    e1.right.right = new Element();

    e1.right.left.key = 55;
    e1.right.left.value = 2;
    e1.right.left.left = new Element();
    e1.right.left.right = new Element();

    e1.add(-10,150);

    
    System.out.println(e1.inOrderString());
  }
}