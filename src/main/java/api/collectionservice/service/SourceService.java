package api.collectionservice.service;

import api.collectionservice.exception.SourceNotFoundException;
import api.collectionservice.model.Source;
import api.collectionservice.payload.request.CreateSourceRequest;
import api.collectionservice.repository.SourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SourceService {

    private final SourceRepository sourceRepository;

    public SourceService(SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository;
    }

    public Source createSource(CreateSourceRequest createSourceRequest){
        return sourceRepository.save(new Source(null,
                createSourceRequest.getSourceName(),
                createSourceRequest.getSourceURL(),
                createSourceRequest.getExceptTag(),
                createSourceRequest.getExceptValues()));
    }

    public void deleteSource(Integer id){
        sourceRepository.deleteById(id);
    }

    public Optional<Source> findById(Integer id){
        return sourceRepository.findById(id);
    }

    public List<Source> getAllSources(){
        return sourceRepository.findAll();
    }
}
