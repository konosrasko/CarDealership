package com.Antiprosopia.car;


import java.util.List;

public interface CarService {
    List<CarDTO> searchCars(String brand, String model, Double maxPrice);

    CarDTO createCar(CarDTO carDTO);
    CarDTO updateCar(Integer carId, Integer quantity);
    CarDTO getCarById(Integer carId);
    List<CarDTO> getAllCars();
    void deleteCar(Integer carId);

    boolean isCarOutOfStock(Integer carId);

    void purchaseCar(Integer carId);
}
