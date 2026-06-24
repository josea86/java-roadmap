class MassOnMoon {
    public static void main(String[] args) {

        // Initialize mass and Earth's gravity variables
        
        double mass = 82.0;
        double gravityEarth = 9.8;

        // Calculate the Moon's gravity (17% of Earth's gravity)

        double gravityMoon = gravityEarth * 0.17;

        // Calculate weight on the Moon using Newton's second law (F = m * a)

        double weightOnMoon = mass * gravityMoon;

        // Print the results to the console

        System.out.println("The gravity on the Moon is " + gravityMoon);
        System.out.println("My weight on the Moon is " + weightOnMoon);
    }
}
