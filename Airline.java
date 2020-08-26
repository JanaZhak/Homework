package AirlineTask;
public class Airline {
     String destination; //пункт назначения
     String flightNumber; //номер рейса
     String typeOfAircraft; //тип самолета
     String departure; // время вылета
     String weekday; //день недели

///конструктор
    public Airline(String destination, String flightNumber, String typeOfAircraft, String departure, String weekday) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfAircraft = typeOfAircraft;
        this.departure = departure;
        this.weekday = weekday;

    }

    //getters
    public String getDestination() {
        return destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public String getDeparture() {
        return departure;
    }

    public String getWeekday() { return weekday;}
//setters
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
    //methods
    public String toString()
    { return "Flight Information\nNumber Of Flight: " + setFlightNumber() +"\nDestination: " + getDeparture();
}




//1)Создать класс Airline: Пункт назначения, Номер рейса, Тип самолета, Время вылета, Дни
//недели.
//Создать массив объектов. Вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых
//больше заданного
