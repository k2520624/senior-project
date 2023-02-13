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

* 샘플 데이터셋을 받아와서 학습시킨 후 모델 파일로 저장
  <img src="https://data-flair.training/blogs/wp-content/uploads/sites/2/2021/07/driver-drowsiness-dataset-sample.png" width="80%" height="50%">
* 학습시킨 모델 파일로 눈 깜빡 여부 예측
  <br>
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

