package meeting.meetingv1.pojo;

public class Driver extends DriverKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column driver.car_id
     *
     * @mbg.generated
     */
    private String carId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column driver.driver_name
     *
     * @mbg.generated
     */
    private String driverName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column driver.driver_tel
     *
     * @mbg.generated
     */
    private String driverTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column driver.car_type
     *
     * @mbg.generated
     */
    private String carType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column driver.is_arrenge
     *
     * @mbg.generated
     */
    private Integer isArrenge;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    public Driver(Integer driverId, Integer meetingId, String carId, String driverName, String driverTel, String carType, Integer isArrenge) {
        super(driverId, meetingId);
        this.carId = carId;
        this.driverName = driverName;
        this.driverTel = driverTel;
        this.carType = carType;
        this.isArrenge = isArrenge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    public Driver() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column driver.car_id
     *
     * @return the value of driver.car_id
     *
     * @mbg.generated
     */
    public String getCarId() {
        return carId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column driver.car_id
     *
     * @param carId the value for driver.car_id
     *
     * @mbg.generated
     */
    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column driver.driver_name
     *
     * @return the value of driver.driver_name
     *
     * @mbg.generated
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column driver.driver_name
     *
     * @param driverName the value for driver.driver_name
     *
     * @mbg.generated
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column driver.driver_tel
     *
     * @return the value of driver.driver_tel
     *
     * @mbg.generated
     */
    public String getDriverTel() {
        return driverTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column driver.driver_tel
     *
     * @param driverTel the value for driver.driver_tel
     *
     * @mbg.generated
     */
    public void setDriverTel(String driverTel) {
        this.driverTel = driverTel == null ? null : driverTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column driver.car_type
     *
     * @return the value of driver.car_type
     *
     * @mbg.generated
     */
    public String getCarType() {
        return carType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column driver.car_type
     *
     * @param carType the value for driver.car_type
     *
     * @mbg.generated
     */
    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column driver.is_arrenge
     *
     * @return the value of driver.is_arrenge
     *
     * @mbg.generated
     */
    public Integer getIsArrenge() {
        return isArrenge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column driver.is_arrenge
     *
     * @param isArrenge the value for driver.is_arrenge
     *
     * @mbg.generated
     */
    public void setIsArrenge(Integer isArrenge) {
        this.isArrenge = isArrenge;
    }
}