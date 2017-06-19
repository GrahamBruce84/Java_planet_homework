class Planet {
  private String name;
  private String size;

  public Planet(String name, String size){
    this.name = name;
    this.size = size;
  }


  public String getName() {
    return this.name;
  }

  public String getSize() {
    return this.size;
  }

  public String explode() {
    return ("BOOM! " + this.name + " has exploded.");
  }

}