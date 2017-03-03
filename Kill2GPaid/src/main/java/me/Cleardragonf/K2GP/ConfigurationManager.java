package me.Cleardragonf.K2GP;
  
import java.io.File;
import java.io.IOException;
 
import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.hocon.HoconConfigurationLoader;
import ninja.leaping.configurate.loader.ConfigurationLoader;
  
public class ConfigurationManager {
 
    private static ConfigurationManager instance = new ConfigurationManager();
 
 
 
    public static ConfigurationManager getInstance(){
        return instance ;
    }
     
 
 
    private File configDir;
 
     
     
    //The configuration folder for this plugi
    public void ConfigurationManager2(File configDir) {
        this.configDir = configDir;
    }
 
 
    // The config Manager for the mail storage file
    private ConfigurationLoader<CommentedConfigurationNode>configLoader1;
    private ConfigurationLoader<CommentedConfigurationNode>configLoader2;
    private ConfigurationLoader<CommentedConfigurationNode>configLoader3;
    private ConfigurationLoader<CommentedConfigurationNode>configLoader4;
    private ConfigurationLoader<CommentedConfigurationNode>configLoader5;
    private ConfigurationLoader<CommentedConfigurationNode>TimeTrackLoader;
     
    // the in-memory version of the mail storage file
    private CommentedConfigurationNode config1;
    private CommentedConfigurationNode config2;
    private CommentedConfigurationNode config3;
    private CommentedConfigurationNode config4;
    private CommentedConfigurationNode config5;
    private CommentedConfigurationNode TimeTracker;
 
       
      public void enable()
      {
        //setting the name of the file
        File Week1 = new File(this.configDir, "Week1.conf");
        File Week2 = new File(this.configDir, "Week2.conf");
        File Week3 = new File(this.configDir, "Week3.conf");
        File Week4 = new File(this.configDir, "Week4.conf");
        File Week5 = new File(this.configDir, "Week5.conf");
        File TimeTrackerTime = new File(this.configDir, "TimeTracking.conf");
 
        this.configLoader1 = HoconConfigurationLoader.builder().setFile(Week1).build();
        this.configLoader2 = HoconConfigurationLoader.builder().setFile(Week2).build();
        this.configLoader3 = HoconConfigurationLoader.builder().setFile(Week3).build();
        this.configLoader4 = HoconConfigurationLoader.builder().setFile(Week4).build();
        this.configLoader5 = HoconConfigurationLoader.builder().setFile(Week5).build();
        this.TimeTrackLoader = HoconConfigurationLoader.builder().setFile(TimeTrackerTime).build();
         
        try{
            //create a new folder if it does not exist
            if(!this.configDir.isDirectory()){
                this.configDir.mkdirs();
            }
            //create a new one if the file does not exist
                         
            if(!TimeTrackerTime.isFile()){
                try{
                    TimeTrackerTime.createNewFile();
                    loadTime();
                    TimeTracker.getNode("========Time Tracking========").setComment("The Point of this config is to keep track of the Time and Date");
                    TimeTracker.getNode("========Time Tracking========", "Day: ").setComment("Day number in Game. Between 1-30").setValue("1");
                    TimeTracker.getNode("========Time Tracking========", "Time: ").setComment("Set the Time in Game. Between 0 - 24000").setValue("0");
                    saveTime();             
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(!Week1.isFile()){
                try{
                    Week1.createNewFile();
                    load1();
                    config1.getNode("========Economy Rewards========").setComment("This Portion is used to Reward Players with Economy Money");
                    config1.getNode("========Economy Rewards========", "bat").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "blaze").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "cavespider").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "chicken").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "cow").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "creeper").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "enderdragon").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "enderman").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "ghast").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "giant").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "guardian").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "horse").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "irongolem").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "magmacube").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "mushroomcow").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "ocelot").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "pig").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "pigzombie").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "rabbit").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "sheep").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "skeleton").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "slime").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "snowman").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "spider").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "squid").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "witch").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "wither").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "wolf").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "zombie").setComment("How much is killing a Sheep Worth?").setValue("5");
                    config1.getNode("========Economy Rewards========", "Unknown").setComment("How much is killing a Sheep Worth?").setValue("5");
                     
                    save1();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(!Week2.isFile()){
                try{
                    Week2.createNewFile();
                    load2();
 
                     
                    save2();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(!Week3.isFile()){
                try{
                    Week3.createNewFile();
                    load3();
                     
                                                     
                    save3();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(!Week4.isFile()){
                try{
                    Week4.createNewFile();
                    load4();
                                                     
                    save4();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(!Week5.isFile()){
                try{
                    Week5.createNewFile();
                    load5();
                     
                                                     
                    save5();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
 
            //load the stored mails
            this.config1 = this.configLoader1.load();
            this.config2 = this.configLoader2.load();
            this.config3 = this.configLoader3.load();
            this.config4 = this.configLoader4.load();
            this.config5 = this.configLoader5.load();
            this.TimeTracker = this.TimeTrackLoader.load();
        }catch (IOException e){
            return;
        }
      }
    private void loadTime() {
        try{
            TimeTracker = TimeTrackLoader.load();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void load1(){
          try{
              config1 = configLoader1.load();
          }catch(IOException e){
              e.printStackTrace();
          }
      }
      public void load2(){
          try{
              config2 = configLoader2.load();
          }catch(IOException e){
              e.printStackTrace();
          }
      }
      public void load3(){
          try{
              config3 = configLoader3.load();
          }catch(IOException e){
              e.printStackTrace();
          }
      }
      public void load4(){
          try{
              config4 = configLoader4.load();
          }catch(IOException e){
              e.printStackTrace();
          }
      }
      public void load5(){
          try{
              config5 = configLoader5.load();
          }catch(IOException e){
              e.printStackTrace();
          }
      } 
      private void saveTime() {
          try{
              TimeTrackLoader.save(TimeTracker);
          }catch(IOException e){
              e.printStackTrace();
          }
      }
      public void save1(){
          try{
              configLoader1.save(config1);
          }catch(IOException e){
              e.printStackTrace();
          }
      }
      public void save2(){
          try{
              configLoader2.save(config2);
          }catch(IOException e){
              e.printStackTrace();
          }
      }
      public void save3(){
          try{
              configLoader3.save(config3);
          }catch(IOException e){
              e.printStackTrace();
          }
      }
      public void save4(){
          try{
              configLoader4.save(config4);
          }catch(IOException e){
              e.printStackTrace();
          }
      }
      public void save5(){
          try{
              configLoader5.save(config5);
          }catch(IOException e){
              e.printStackTrace();
          }
      }
       
      public CommentedConfigurationNode getConfig1(){
          return config1;
      }
      public CommentedConfigurationNode getConfig2(){
          return config2;
      }
      public CommentedConfigurationNode getConfig3(){
          return config3;
      }
      public CommentedConfigurationNode getConfig4(){
          return config4;
      }
      public CommentedConfigurationNode getConfig5(){
          return config5;
      }
      public CommentedConfigurationNode getTimeTrack(){
          return TimeTracker;
      }
}