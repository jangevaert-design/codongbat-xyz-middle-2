public class XyzMiddle2 {
  public boolean xyzMiddle(String str) {

    for (int i = 0; i <=str.length() - 3; i++) {
      if (str.substring(i, i+3).equals("xyz") &&
          Math.abs(str.length() -i- 3- i) <= 1) {
        return true;
      }
    }
    return false;
  }
}
