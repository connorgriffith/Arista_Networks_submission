
class SumPaths1 {
    public static void main(String[] args) {
      testSanity();
      test1();
      test2();
     
    }
    

    private static void testSanity() {
    Node root = new Node(1);
      Paths many_paths = new Paths();
      
      int res = many_paths.start_path(root);

      int expected = 1;

      if (res == expected) {
        System.out.println("Sanity test passed!");
      } else {
        System.out.println("Sanity test failed; expected " + expected + " but got " + res + " instead.");
      }

   }
   
   //Adding more nodes and diverse paths
   private static void test1(){
      Node root = new Node(10);
      Node treePart1 = new Node(8);
      Node treePart2 = new Node(2);
      Node treePart3 = new Node(3);
      Node treePart4 = new Node(5);
      Node treePart5 = new Node(2);
      root.setLeft(treePart1);
      root.setRight(treePart2);
      root.left().setLeft(treePart3); 
      root.left().setRight(treePart4);
      root.right().setLeft(treePart5);
      
      Paths many_paths = new Paths();
      
      int res = many_paths.start_path(root);

      int expected = 3190;

      if (res == expected) {
        System.out.println("Test1 passed!");
      } else {
        System.out.println("Test1 failed; expected " + expected + " but got " + res + " instead.");

   
   }
 }
 
  //Adding more nodes and diverse paths
   private static void test2(){
      
      Node root = new Node(10);
      Node treePart1 = new Node(8);
      Node treePart2 = new Node(2);
      Node treePart3 = new Node(3);
      Node treePart4 = new Node(5);
      Node treePart5 = new Node(2);
      Node treePart6 = new Node(8);
      Node treePart7 = new Node(8);
      Node treePart8 = new Node(8);
      Node treePart9 = new Node(8);
      root.setLeft(treePart1);
      root.setRight(treePart2);
      root.left().setLeft(treePart3); 
      root.left().setRight(treePart4);
      root.right().setLeft(treePart5);
      root.left().left().setLeft(treePart6);
      root.left().left().setRight(treePart7);
      root.left().right().setLeft(treePart8);
      root.left().right().setRight(treePart9);
      
      Paths many_paths = new Paths();
      
      int res = many_paths.start_path(root);


      int expected = 44414;

      if (res == expected) {
        System.out.println("Test2 passed!");
      } else {
        System.out.println("Test2 failed; expected " + expected + " but got " + res + " instead.");

   }
  }
 }
   