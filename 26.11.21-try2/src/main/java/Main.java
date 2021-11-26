public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext();
        applicationContext.init(SolarSystemConfig.class);
//        applicationContext.init(OtherSolarSystemConfig.class);
        SolarSystem solarSystem = applicationContext.getBean(SolarSystem.class);
        System.out.println(solarSystem);

        System.out.println(applicationContext.getBean("getStar",Star.class));
        System.out.println(applicationContext.getBean("getStar",Star.class));
        System.out.println(applicationContext.getBean("getStar",Star.class));
        System.out.println(applicationContext.getBean("getStar",Star.class));

        //System.out.println(solarSystem);
    }
}
