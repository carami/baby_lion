package org.example.iocexam;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

//@Data  -- setter,getter,toString,equals..  (권장하지는 않는다.)
@Setter
@Getter
@Component
public class Book {
    private String title;
    private int price;
}

//Book 을 빈으로 등록하는 방법
//1.javaconfig
//2.componentScan
