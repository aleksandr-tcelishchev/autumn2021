package legacy;

public class DiscountService {
    private HistoryService historyService;
    private DiscountRepository discountRepository;

    public DiscountService(HistoryService historyService, DiscountRepository discountRepository) {
        this.historyService = historyService;
        this.discountRepository = discountRepository;
    }
}
