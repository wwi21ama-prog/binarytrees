class Element {
  int key;
  int value;

  Element left;
  Element right;
  
  public String toString() {
    if (!isValid()) {
      return "";
    }
    return "(" + key + "," + value + ")";
  }

  public boolean isValid() {
    return left != null && right != null;
  }

  public String inOrderString() {
    
    if (!isValid()) {
      return "";
    }
    
    String result = left.inOrderString();
    result += toString();
    result += right.inOrderString();
    return result;
  }

  public void add(int key, int value) {
    if (!isValid()) { 
      this.key = key;
      this.value = value;
      this.left = new Element();
      this.right = new Element();
      return;
    }

    if (key < this.key) {
      left.add(key,value);
    } else {
      right.add(key,value);
    }
  }

  public int get(int key) {
    // TODO
    return 0;
  }
}
