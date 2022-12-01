package controllers;

import dtos.CreateParkingLotRequestDto;
import dtos.CreateParkingLotResponseDto;
import dtos.ResponseDto;
import models.ParkingLot;
import services.ParkingLotService;

public class ParkingLotController {
    private ParkingLotService parkingLotService = new ParkingLotService();

    public ResponseDto<CreateParkingLotResponseDto> createParkingLot(CreateParkingLotRequestDto requestDto){
        ParkingLot parkingLot = parkingLotService.createParkingLot(requestDto.getAddress());

        CreateParkingLotResponseDto responseDto = new CreateParkingLotResponseDto();
        responseDto.setParkingLot(parkingLot);

        ResponseDto<CreateParkingLotResponseDto> baseResponse = new ResponseDto<>();
        baseResponse.setStatus("Success");
        baseResponse.setData(responseDto);
        return  baseResponse;
    }
}
