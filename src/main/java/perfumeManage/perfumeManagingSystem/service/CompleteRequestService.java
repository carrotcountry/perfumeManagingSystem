package perfumeManage.perfumeManagingSystem.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import perfumeManage.perfumeManagingSystem.domain.CompleteRequest;
import perfumeManage.perfumeManagingSystem.domain.ProcessingRequest;
import perfumeManage.perfumeManagingSystem.repository.CompleteRequestRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompleteRequestService {
    private final CompleteRequestRepository completeRequestRepository;

    public List<CompleteRequest> findAllCompleteRequests() {
        return completeRequestRepository.findAllCompleteRequest();
    }

    public CompleteRequest findCompleteRequest(Long id) {
        return completeRequestRepository.findById(id);
    }
}
