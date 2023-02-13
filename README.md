# 얼굴인식 자동출석 프로그램

* 군산대학교 IT정보제어공학부 4학년 졸업 작품(팀장)
* 역할 Web(main), face recognition(sub)
### Summary

1. 회원가입시 교수와 학생을 구별하여 가입

2. 로그인 후 수업 입장시 얼굴 인식된 사람만 입장이 가능
3. 수업에 입장하면 웹에 스트리밍 영상이 띄워짐
4. 수업 중 눈이 감겨있는 행동이 5분 이상 지속시 경고 및 기록
5. 기록된 데이터를 교수에게 전송


  <br>
  
  
### Block diagram


<img src="https://user-images.githubusercontent.com/75367132/218461603-0c9e0616-c3ef-4adc-9ed6-e98a62a12568.PNG" width="80%" height="50%">


<br>

## About Project


### Web

<img src="https://img.shields.io/badge/Language-Java-green?style=flat"/><img src="https://img.shields.io/badge/Framework-Spring-blue?style=flat"/>

* java(spring)로 웹을 만들어 python과 실시간으로 데이터를 주고받으며 순차적으로 프로그램이 실행되도록 구현
* vlc player를 사용해서 각자 얼굴이 송출되는 스트리밍 영상 ip 주소를 받아와서 jsp 구현 
* java와 python 사이의 데이터 통신은 websocket 라이브러리 사용 (sub)

  <img src="https://user-images.githubusercontent.com/75367132/218469938-826fe1d4-e89b-444f-95ef-efe9bca4837f.PNG" width="50%" height="50%"><img src="https://user-images.githubusercontent.com/75367132/218469944-d1211a58-4b4c-435c-8c97-3b5c1927c4c5.PNG" width="50%" height="50%">
  <img src="https://user-images.githubusercontent.com/75367132/218469785-4930ff1b-7451-4b48-a02c-21e804cb59c5.PNG" width="50%" height="50%">


  <br>

### Face recognition

<img src="https://img.shields.io/badge/Language-Python-green?style=flat"/><img src="https://img.shields.io/badge/Library-Opencv-blue?style=flat"/>

* python dlib 라이브러리를 사용해서 미리 저장된 사진과 영상속 얼굴을 비교 후 판단

  <img src="https://user-images.githubusercontent.com/75367132/218464861-a26cfa21-918e-4ce9-bb1e-09d59d1783d3.PNG" width="50%" height="50%">

  <br>
  
## 참고한 링크
***

[스트리밍](https://m.post.naver.com/viewer/postView.nhn?volumeNo=29553682&memberNo=2534901&vType=VERTICAL)

[얼굴인식_dlib](https://yunwoong.tistory.com/84)

[dlib_download](https://thecodingnote.tistory.com/8)

[눈깜박인식](https://github.com/kairess/eye_blink_detector)


## Results

https://youtu.be/MJOeVdWbd_E



<br>

