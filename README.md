- [x]  빈 문자열 또는 null 입력시 0 반환
<br/>
- [ ]  음수를 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : “-1,2,3”)
<br/>
- [x]  숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.(예 : “1”)
<br/>
- [ ]  숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.(예 : “1,2”)
<br/>
- [ ]  구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다. (예 : “1,2:3” => 6)
<br/>
- [ ]  “//”와 “\n” 문자 사이에 커스텀 구분자를 지정할 수 있다. (예 : “//;\n1;2;3” => 6)
      ; : & @ # % = - ! ] }
 <br/>
- [ ]  커스텀 구분자 형식의 문자열 중 숫자값을 빈 문자열로 입력한 경우 0을 반환한다.
      (예 : “//:\n” => 0) (차이 : “//:\n2:3::” => 6)