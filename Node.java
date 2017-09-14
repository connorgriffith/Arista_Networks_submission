
class Node {
  private final int value;
  private Node left = null;
  private Node right = null;

  public Node(int val) {
    this.value = val;
  }

  public Node right() {
    return this.right;
  }

  public Node left() {
    return this.left;
  }

  public void setRight(Node r) {
    this.right = r;
  }

  public void setLeft(Node l) {
    this.left = l;
  }

  public int value() {
    return this.value;
  }

}


class Paths{
   
  public Paths(){
  }

  public int start_path(Node root){
    
    //Define an array of 1000 elements to house node values
    int init_paths[] = new int[1000];
        
    //This is the first node on the path, the rest of the connected nodes will be taken into account recursively
    return sumPaths(root, init_paths, 0);

  }

  public int sumPaths(Node node, int path[], int length_of_path) {

    
    //If the root is 0 then return -1
    if(node == null && length_of_path == 0){
      return (-1);
    }
    
    //Recursive base case
    if(node == null){
      return 0;
    }

    path[length_of_path] = node.value(); //move the value of the discovered node into the arraylist
    length_of_path  += 1;  //increase the length of the path to accound for the node whose data was just added

    //If there is no where else to go, add up the path traveled
    if (node.left() == null && node.right() == null) {
        return path_value(path, length_of_path);
    }

    else{
      //Recursively call this function again for the left and right nodes
      return sumPaths(node.left(), path, length_of_path) + sumPaths(node.right(), path, length_of_path);
      
    }

  }
    
  //This is where the adding goes on. Adds all the values found on a path
  public int path_value(int path_to_print[], int path_length){

    int alignment_var = 0;
    int pathSum = 0;
    int counter = path_length - 1;
    while(counter >= 0){
      if (alignment_var == 0) {
        pathSum += path_to_print[counter];
      }
      else{
        pathSum += (path_to_print[counter] * java.lang.Math.pow(10, alignment_var)); 
      }
      counter--;
      alignment_var++;
    }
   
    return pathSum;

  }
  
}
