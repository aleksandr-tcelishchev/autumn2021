package legacy;

public class HistoryService {
    private HistoryRepository historyRepository;

    public HistoryService() {
        this.historyRepository = ApplicationContext.get(HistoryRepository.class);
    }
}
