package school_online.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school_online.repo.LectureRepo;

@Service
public class LectureService {
    private LectureRepo lectureRepo;

    @Autowired
    public LectureService(LectureRepo lectureRepo) {
        this.lectureRepo = lectureRepo;
    }

}



