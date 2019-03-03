package com.aquar.myaquar_egypt.Model.ModelsOfProjectDetails;

import java.util.List;

public class ModelObjectsOfProjectDetails {


    /**
     * id : 1
     * type : department
     * category : residential
     * developer : HDG
     * project : Azad
     * favorite : false
     * min_rooms : 3
     * max_rooms : 3
     * min_bathsrooms : 1
     * max_bathsrooms : 1
     * min_price : 5000
     * max_price : 5000
     * min_area : 80
     * max_area : 80
     * accommodation : null
     * location : New Cairo
     * viewer_360 : http://aquar.me/myaquar_eg/uploads/products/360_2.jpg
     * description : prime location with an attractive payment plan, 10% Downpayment - 10% after 3 Months - 10% on Delivery &  Equal installments over 6 Years
     * slider_images : [{"image_id":2,"image_url":"http://aquar.me/myaquar_eg/uploads/projects/Azad_Mob_5.jpg"},{"image_id":3,"image_url":"http://aquar.me/myaquar_eg/uploads/projects/Azad_Mob_7.jpg"},{"image_id":4,"image_url":"http://aquar.me/myaquar_eg/uploads/projects/Azad_Mob_9.jpg"},{"image_id":5,"image_url":"http://aquar.me/myaquar_eg/uploads/projects/Azad_Mob_11.jpg"},{"image_id":6,"image_url":"http://aquar.me/myaquar_eg/uploads/projects/Azad_Mob_31.jpg"},{"image_id":7,"image_url":"http://aquar.me/myaquar_eg/uploads/projects/azad_pqroject.jpg"}]
     */

    private int id;
    private String type;
    private String category;
    private String developer;
    private String project;
    private String favorite;
    private int min_rooms;
    private int max_rooms;
    private int min_bathsrooms;
    private int max_bathsrooms;
    private int min_price;
    private int max_price;
    private int min_area;
    private int max_area;
    private Object accommodation;
    private String location;
    private String viewer_360;
    private String description;
    private List<SliderImagesBean> slider_images;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public int getMin_rooms() {
        return min_rooms;
    }

    public void setMin_rooms(int min_rooms) {
        this.min_rooms = min_rooms;
    }

    public int getMax_rooms() {
        return max_rooms;
    }

    public void setMax_rooms(int max_rooms) {
        this.max_rooms = max_rooms;
    }

    public int getMin_bathsrooms() {
        return min_bathsrooms;
    }

    public void setMin_bathsrooms(int min_bathsrooms) {
        this.min_bathsrooms = min_bathsrooms;
    }

    public int getMax_bathsrooms() {
        return max_bathsrooms;
    }

    public void setMax_bathsrooms(int max_bathsrooms) {
        this.max_bathsrooms = max_bathsrooms;
    }

    public int getMin_price() {
        return min_price;
    }

    public void setMin_price(int min_price) {
        this.min_price = min_price;
    }

    public int getMax_price() {
        return max_price;
    }

    public void setMax_price(int max_price) {
        this.max_price = max_price;
    }

    public int getMin_area() {
        return min_area;
    }

    public void setMin_area(int min_area) {
        this.min_area = min_area;
    }

    public int getMax_area() {
        return max_area;
    }

    public void setMax_area(int max_area) {
        this.max_area = max_area;
    }

    public Object getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(Object accommodation) {
        this.accommodation = accommodation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getViewer_360() {
        return viewer_360;
    }

    public void setViewer_360(String viewer_360) {
        this.viewer_360 = viewer_360;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SliderImagesBean> getSlider_images() {
        return slider_images;
    }

    public void setSlider_images(List<SliderImagesBean> slider_images) {
        this.slider_images = slider_images;
    }

    public static class SliderImagesBean {
        /**
         * image_id : 2
         * image_url : http://aquar.me/myaquar_eg/uploads/projects/Azad_Mob_5.jpg
         */

        private int image_id;
        private String image_url;

        public int getImage_id() {
            return image_id;
        }

        public void setImage_id(int image_id) {
            this.image_id = image_id;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }
    }
}