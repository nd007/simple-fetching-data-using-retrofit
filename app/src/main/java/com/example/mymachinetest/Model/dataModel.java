package com.example.mymachinetest.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class dataModel {



    @SerializedName("encryptedId")
    @Expose
    private String encryptedId;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("customerPassword")
    @Expose
    private Object customerPassword;
    @SerializedName("petParentPassword")
    @Expose
    private Object petParentPassword;
    @SerializedName("customerEmail")
    @Expose
    private Object customerEmail;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("guestEmail")
    @Expose
    private Object guestEmail;
    @SerializedName("forgotPasswordEmail")
    @Expose
    private Object forgotPasswordEmail;
    @SerializedName("rememberMe")
    @Expose
    private Boolean rememberMe;
    @SerializedName("isLogin")
    @Expose
    private Boolean isLogin;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("confirmPassword")
    @Expose
    private Object confirmPassword;
    @SerializedName("petParentConfirmPassword")
    @Expose
    private Object petParentConfirmPassword;
    @SerializedName("isPrivacyPolicyCheck")
    @Expose
    private Boolean isPrivacyPolicyCheck;
    @SerializedName("notificationStatus")
    @Expose
    private Boolean notificationStatus;
    @SerializedName("displayInPrescription")
    @Expose
    private Boolean displayInPrescription;
    @SerializedName("qualification")
    @Expose
    private Object qualification;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("locationId")
    @Expose
    private Integer locationId;
    @SerializedName("isAllowPrescriptionAccess")
    @Expose
    private Boolean isAllowPrescriptionAccess;
    @SerializedName("cityId")
    @Expose
    private Integer cityId;
    @SerializedName("latLong")
    @Expose
    private String latLong;
    @SerializedName("zipCode")
    @Expose
    private Object zipCode;
    @SerializedName("profileImageUrl")
    @Expose
    private String profileImageUrl;
    @SerializedName("locationList")
    @Expose
    private Object locationList;
    @SerializedName("roleId")
    @Expose
    private String roleId;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("areYouProvider")
    @Expose
    private Boolean areYouProvider;
    @SerializedName("providerFirstName")
    @Expose
    private Object providerFirstName;
    @SerializedName("providerLastName")
    @Expose
    private Object providerLastName;
    @SerializedName("clinicName")
    @Expose
    private Object clinicName;
    @SerializedName("cityName")
    @Expose
    private Object cityName;
    @SerializedName("providerPhoneNumber")
    @Expose
    private Object providerPhoneNumber;
    @SerializedName("mobileNumber")
    @Expose
    private Object mobileNumber;
    @SerializedName("providerEmail")
    @Expose
    private Object providerEmail;
    @SerializedName("providerPassword")
    @Expose
    private Object providerPassword;
    @SerializedName("providerConfirmPassword")
    @Expose
    private Object providerConfirmPassword;
    @SerializedName("userPermissionMasterList")
    @Expose
    private List<Object> userPermissionMasterList = null;
    @SerializedName("isMobileNumberVerified")
    @Expose
    private Boolean isMobileNumberVerified;
    @SerializedName("isEmailVerified")
    @Expose
    private Boolean isEmailVerified;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("fullName")
    @Expose
    private Object fullName;
    @SerializedName("userRole")
    @Expose
    private String userRole;
    @SerializedName("enableTwoStepVerification")
    @Expose
    private Boolean enableTwoStepVerification;
    @SerializedName("hasOphrSubscription")
    @Expose
    private Boolean hasOphrSubscription;
    @SerializedName("userSalt")
    @Expose
    private Object userSalt;
    @SerializedName("vetRegistrationNumber")
    @Expose
    private String vetRegistrationNumber;
    @SerializedName("vetQualification")
    @Expose
    private String vetQualification;
    @SerializedName("onlineAppointmentStatus")
    @Expose
    private Boolean onlineAppointmentStatus;
    @SerializedName("isRegisteredPetParent")
    @Expose
    private Boolean isRegisteredPetParent;
    @SerializedName("isProfileCreated")
    @Expose
    private Boolean isProfileCreated;
    @SerializedName("identityProof")
    @Expose
    private Object identityProof;
    @SerializedName("initials")
    @Expose
    private Object initials;
    @SerializedName("otp")
    @Expose
    private Object otp;
    @SerializedName("petId")
    @Expose
    private Integer petId;
    @SerializedName("numberOfPets")
    @Expose
    private Integer numberOfPets;
    @SerializedName("numberOfAppointments")
    @Expose
    private Integer numberOfAppointments;
    @SerializedName("numberOfStaff")
    @Expose
    private Integer numberOfStaff;


    public ArrayList<com.example.mymachinetest.Model.petListmodel> getPetListmodel() {
        return petListmodel;
    }

    @SerializedName("petList")
    @Expose
   private ArrayList<petListmodel> petListmodel;


//    @SerializedName("pagingHeader")
//    @Expose
//    private String pagingHeader;



    public String getEncryptedId() {
        return encryptedId;
    }

    public void setEncryptedId(String encryptedId) {
        this.encryptedId = encryptedId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Object getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(Object customerPassword) {
        this.customerPassword = customerPassword;
    }

    public Object getPetParentPassword() {
        return petParentPassword;
    }

    public void setPetParentPassword(Object petParentPassword) {
        this.petParentPassword = petParentPassword;
    }

    public Object getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(Object customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Object getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(Object guestEmail) {
        this.guestEmail = guestEmail;
    }

    public Object getForgotPasswordEmail() {
        return forgotPasswordEmail;
    }

    public void setForgotPasswordEmail(Object forgotPasswordEmail) {
        this.forgotPasswordEmail = forgotPasswordEmail;
    }

    public Boolean getRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public Boolean getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Boolean isLogin) {
        this.isLogin = isLogin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Object getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(Object confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Object getPetParentConfirmPassword() {
        return petParentConfirmPassword;
    }

    public void setPetParentConfirmPassword(Object petParentConfirmPassword) {
        this.petParentConfirmPassword = petParentConfirmPassword;
    }

    public Boolean getIsPrivacyPolicyCheck() {
        return isPrivacyPolicyCheck;
    }

    public void setIsPrivacyPolicyCheck(Boolean isPrivacyPolicyCheck) {
        this.isPrivacyPolicyCheck = isPrivacyPolicyCheck;
    }

    public Boolean getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(Boolean notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    public Boolean getDisplayInPrescription() {
        return displayInPrescription;
    }

    public void setDisplayInPrescription(Boolean displayInPrescription) {
        this.displayInPrescription = displayInPrescription;
    }

    public Object getQualification() {
        return qualification;
    }

    public void setQualification(Object qualification) {
        this.qualification = qualification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Boolean getIsAllowPrescriptionAccess() {
        return isAllowPrescriptionAccess;
    }

    public void setIsAllowPrescriptionAccess(Boolean isAllowPrescriptionAccess) {
        this.isAllowPrescriptionAccess = isAllowPrescriptionAccess;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getLatLong() {
        return latLong;
    }

    public void setLatLong(String latLong) {
        this.latLong = latLong;
    }

    public Object getZipCode() {
        return zipCode;
    }

    public void setZipCode(Object zipCode) {
        this.zipCode = zipCode;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public Object getLocationList() {
        return locationList;
    }

    public void setLocationList(Object locationList) {
        this.locationList = locationList;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getAreYouProvider() {
        return areYouProvider;
    }

    public void setAreYouProvider(Boolean areYouProvider) {
        this.areYouProvider = areYouProvider;
    }

    public Object getProviderFirstName() {
        return providerFirstName;
    }

    public void setProviderFirstName(Object providerFirstName) {
        this.providerFirstName = providerFirstName;
    }

    public Object getProviderLastName() {
        return providerLastName;
    }

    public void setProviderLastName(Object providerLastName) {
        this.providerLastName = providerLastName;
    }

    public Object getClinicName() {
        return clinicName;
    }

    public void setClinicName(Object clinicName) {
        this.clinicName = clinicName;
    }

    public Object getCityName() {
        return cityName;
    }

    public void setCityName(Object cityName) {
        this.cityName = cityName;
    }

    public Object getProviderPhoneNumber() {
        return providerPhoneNumber;
    }

    public void setProviderPhoneNumber(Object providerPhoneNumber) {
        this.providerPhoneNumber = providerPhoneNumber;
    }

    public Object getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Object mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Object getProviderEmail() {
        return providerEmail;
    }

    public void setProviderEmail(Object providerEmail) {
        this.providerEmail = providerEmail;
    }

    public Object getProviderPassword() {
        return providerPassword;
    }

    public void setProviderPassword(Object providerPassword) {
        this.providerPassword = providerPassword;
    }

    public Object getProviderConfirmPassword() {
        return providerConfirmPassword;
    }

    public void setProviderConfirmPassword(Object providerConfirmPassword) {
        this.providerConfirmPassword = providerConfirmPassword;
    }

    public List<Object> getUserPermissionMasterList() {
        return userPermissionMasterList;
    }

    public void setUserPermissionMasterList(List<Object> userPermissionMasterList) {
        this.userPermissionMasterList = userPermissionMasterList;
    }

    public Boolean getIsMobileNumberVerified() {
        return isMobileNumberVerified;
    }

    public void setIsMobileNumberVerified(Boolean isMobileNumberVerified) {
        this.isMobileNumberVerified = isMobileNumberVerified;
    }

    public Boolean getIsEmailVerified() {
        return isEmailVerified;
    }

    public void setIsEmailVerified(Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Object getFullName() {
        return fullName;
    }

    public void setFullName(Object fullName) {
        this.fullName = fullName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Boolean getEnableTwoStepVerification() {
        return enableTwoStepVerification;
    }

    public void setEnableTwoStepVerification(Boolean enableTwoStepVerification) {
        this.enableTwoStepVerification = enableTwoStepVerification;
    }

    public Boolean getHasOphrSubscription() {
        return hasOphrSubscription;
    }

    public void setHasOphrSubscription(Boolean hasOphrSubscription) {
        this.hasOphrSubscription = hasOphrSubscription;
    }

    public Object getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(Object userSalt) {
        this.userSalt = userSalt;
    }

    public String getVetRegistrationNumber() {
        return vetRegistrationNumber;
    }

    public void setVetRegistrationNumber(String vetRegistrationNumber) {
        this.vetRegistrationNumber = vetRegistrationNumber;
    }

    public String getVetQualification() {
        return vetQualification;
    }

    public void setVetQualification(String vetQualification) {
        this.vetQualification = vetQualification;
    }

    public Boolean getOnlineAppointmentStatus() {
        return onlineAppointmentStatus;
    }

    public void setOnlineAppointmentStatus(Boolean onlineAppointmentStatus) {
        this.onlineAppointmentStatus = onlineAppointmentStatus;
    }

    public Boolean getIsRegisteredPetParent() {
        return isRegisteredPetParent;
    }

    public void setIsRegisteredPetParent(Boolean isRegisteredPetParent) {
        this.isRegisteredPetParent = isRegisteredPetParent;
    }

    public Boolean getIsProfileCreated() {
        return isProfileCreated;
    }

    public void setIsProfileCreated(Boolean isProfileCreated) {
        this.isProfileCreated = isProfileCreated;
    }

    public Object getIdentityProof() {
        return identityProof;
    }

    public void setIdentityProof(Object identityProof) {
        this.identityProof = identityProof;
    }

    public Object getInitials() {
        return initials;
    }

    public void setInitials(Object initials) {
        this.initials = initials;
    }

    public Object getOtp() {
        return otp;
    }

    public void setOtp(Object otp) {
        this.otp = otp;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getNumberOfPets() {
        return numberOfPets;
    }

    public void setNumberOfPets(Integer numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public Integer getNumberOfAppointments() {
        return numberOfAppointments;
    }

    public void setNumberOfAppointments(Integer numberOfAppointments) {
        this.numberOfAppointments = numberOfAppointments;
    }

    public Integer getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(Integer numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }


}


