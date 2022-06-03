package chapter4;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// https://stepik.org/lesson/498100/step/11
class PhoneBook {
    private final Map<String, Collection<PhoneNumber>> nameToPhoneNumbersMap = new HashMap<>();

    public void addNewPhoneNumbers(String name, Collection<PhoneNumber> numbers) {
        nameToPhoneNumbersMap.computeIfPresent(name, (s, phoneNumbers) ->
                Stream.concat(phoneNumbers.stream(), numbers.stream())
                        .collect(Collectors.toList()));
        nameToPhoneNumbersMap.computeIfAbsent(name, phoneNumbers -> numbers);// write your code here
    }

    public void printPhoneBook() {
        nameToPhoneNumbersMap.forEach((s, phoneNumbers) -> {
            System.out.println(s);
            phoneNumbers.forEach(phoneNumber ->
                    System.out.println(phoneNumber.getType() + ": " + phoneNumber.getNumber()));
        });// write your code here
    }
}

enum PhoneNumberType {
    MOBILE, HOME, WORK,
}

class PhoneNumber {

    private PhoneNumberType type;
    private String number;

    public PhoneNumber(PhoneNumberType type, String number) {
        this.type = type;
        this.number = number;
    }

    public PhoneNumberType getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }
}
