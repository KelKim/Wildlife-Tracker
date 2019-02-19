public class Animals {
    private String name;
    private int id;
  
    public Animals(String name, int id) {
      this.name = name;
      this.id = id;
    }
  
    public String getName() {
      return name;
    }
  
    public int getId() {
      return id;
    }
    // // public void save() {
    // //     try(Connection con = DB.sql2o.open()) {
    // //       String sql = "INSERT INTO persons (name, email) VALUES (:name, :email)";
    // //       con.createQuery(sql)
    // //         .addParameter("name", this.name)
    // //         .addParameter("email", this.email)
    // //         .executeUpdate();
    // //     }
    //   }
  }